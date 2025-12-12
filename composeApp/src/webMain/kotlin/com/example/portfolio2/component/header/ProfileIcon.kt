package com.example.portfolio2.component.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portfolio2.util.WindowSizeClass

@Composable
fun ProfileIcon(windowSizeClass: WindowSizeClass) {
    val iconSize = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 100.dp
        WindowSizeClass.MEDIUM -> 110.dp
        WindowSizeClass.EXPANDED -> 120.dp
    }

    val fontSize = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 52.sp
        WindowSizeClass.MEDIUM -> 58.sp
        WindowSizeClass.EXPANDED -> 64.sp
    }

    Box(
        modifier = Modifier
            .size(iconSize)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "👤",
            fontSize = fontSize
        )
    }
}