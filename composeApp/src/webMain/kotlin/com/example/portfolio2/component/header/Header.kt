package com.example.portfolio2.component.header

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.portfolio2.theme.ThemeSpacing
import com.example.portfolio2.util.WindowSizeClass

/**
 * ヘッダーコンポーネント
 * サイト上部に表示されるプロフィールエリア
 */
@Composable
fun Header(windowSizeClass: WindowSizeClass) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.primaryContainer,
        tonalElevation = 2.dp
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            when (windowSizeClass) {
                WindowSizeClass.COMPACT -> {
                    // モバイル: 縦並びレイアウト
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                horizontal = ThemeSpacing.HorizontalPadding.container(windowSizeClass),
                                vertical = ThemeSpacing.VerticalPadding.header(windowSizeClass)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(
                            ThemeSpacing.Spacing.header(windowSizeClass)
                        )
                    ) {
                        ProfileIcon(windowSizeClass)
                        ProfileIntroduction(windowSizeClass)
                    }
                }
                WindowSizeClass.MEDIUM, WindowSizeClass.EXPANDED -> {
                    // タブレット・デスクトップ: 横並びレイアウト
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                horizontal = ThemeSpacing.HorizontalPadding.container(windowSizeClass),
                                vertical = ThemeSpacing.VerticalPadding.header(windowSizeClass)
                            ),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(
                            ThemeSpacing.Spacing.header(windowSizeClass)
                        )
                    ) {
                        ProfileIcon(windowSizeClass)
                        ProfileIntroduction(windowSizeClass)
                    }
                }
            }
        }
    }
}
