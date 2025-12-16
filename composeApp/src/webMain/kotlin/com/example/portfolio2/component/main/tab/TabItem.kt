package com.example.portfolio2.component.main.tab

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portfolio2.JapaneseFonts
import com.example.portfolio2.util.WindowSizeClass

@Composable
fun TabItem(
    title: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    windowSizeClass: WindowSizeClass
) {
    val backgroundColor = if (isSelected) {
        MaterialTheme.colorScheme.primaryContainer
    } else {
        MaterialTheme.colorScheme.surface
    }

    val textColor = if (isSelected) {
        MaterialTheme.colorScheme.onPrimaryContainer
    } else {
        MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
    }

    val fontSize = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 14.sp
        WindowSizeClass.MEDIUM -> 15.sp
        WindowSizeClass.EXPANDED -> 16.sp
    }

    val horizontalPadding = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 16.dp
        WindowSizeClass.MEDIUM -> 20.dp
        WindowSizeClass.EXPANDED -> 24.dp
    }

    val verticalPadding = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 12.dp
        else -> 16.dp
    }

    Surface(
        onClick = onClick,
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 4.dp),
        color = backgroundColor,
        shape = MaterialTheme.shapes.medium
    ) {
        Box(
            modifier = Modifier.padding(horizontal = horizontalPadding, vertical = verticalPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                fontFamily = JapaneseFonts.notoSans(),
                fontSize = fontSize,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                color = textColor
            )
        }
    }
}

