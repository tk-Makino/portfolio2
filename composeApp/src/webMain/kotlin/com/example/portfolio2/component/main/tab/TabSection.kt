package com.example.portfolio2.component.main.tab

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.portfolio2.`object`.tab.TabSectionObject
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

    val horizontalPadding = horizontalPaddingFor(windowSizeClass)
    val verticalPadding = verticalPaddingFor(windowSizeClass)

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
                    horizontal = horizontalPadding,
                    vertical = verticalPadding
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
 * 水平パディング取得
 *
 * @param windowSizeClass
 * @return Dp
 */
private fun horizontalPaddingFor(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
    WindowSizeClass.COMPACT -> 8.dp
    WindowSizeClass.MEDIUM -> 24.dp
    WindowSizeClass.EXPANDED -> 100.dp
}

/**
 * 垂直パディング取得
 *
 * @param windowSizeClass
 * @return Dp
 */
private fun verticalPaddingFor(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
    WindowSizeClass.COMPACT -> 8.dp
    else -> 12.dp
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
