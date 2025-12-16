package com.example.portfolio2.component.main.tab

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.portfolio2.`object`.tab.TabSectionObject
import com.example.portfolio2.util.WindowSizeClass



@Composable
fun TabSection(
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit,
    windowSizeClass: WindowSizeClass
) {
    val tabs = listOf(
        TabSectionObject.PROFILE,
        TabSectionObject.SKILLS,
        TabSectionObject.EXPERIENCE,
    )

    val horizontalPadding = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 8.dp
        WindowSizeClass.MEDIUM -> 24.dp
        WindowSizeClass.EXPANDED -> 100.dp
    }

    val verticalPadding = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 8.dp
        else -> 12.dp
    }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 1.dp
    ) {
        // 全画面サイズで横並びレイアウト
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = horizontalPadding, vertical = verticalPadding),
            horizontalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            tabs.forEachIndexed { index, title ->
                TabItem(
                    title = title,
                    isSelected = selectedTabIndex == index,
                    onClick = { onTabSelected(index) },
                    windowSizeClass = windowSizeClass
                )
            }
        }
    }
}
