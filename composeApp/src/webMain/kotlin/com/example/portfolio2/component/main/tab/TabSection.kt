package com.example.portfolio2.component.main.tab

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.portfolio2.`object`.tab.TabSectionObject
import com.example.portfolio2.theme.ThemeSpacing
import com.example.portfolio2.util.WindowSizeClass

/**
 * タブセクション
 *
 * @param selectedTabIndex
 * @param onTabSelected
 * @param windowSizeClass
 */
@Composable
fun TabSection(
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit,
    windowSizeClass: WindowSizeClass
) {
    val tabs = listOf(
        TabSectionObject.PROFILE,
        TabSectionObject.ACHIEVEMENT,
    )

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 1.dp
    ) {
        // 全画面サイズで横並びレイアウト
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = ThemeSpacing.HorizontalPadding.tab(windowSizeClass),
                    vertical = ThemeSpacing.VerticalPadding.tab(windowSizeClass)
                ),
            horizontalArrangement = horizontalArrangementFor(windowSizeClass)
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

/**
 * 横並び配置取得
 *
 * @param windowSizeClass
 */
private fun horizontalArrangementFor(windowSizeClass: WindowSizeClass) = when (windowSizeClass) {
    WindowSizeClass.COMPACT -> Arrangement.Center
    else -> Arrangement.spacedBy(0.dp)
}
