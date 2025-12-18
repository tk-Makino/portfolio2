package com.example.portfolio2.component.header

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
                            .padding(horizontal = 16.dp, vertical = 24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
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
                                horizontal = if (windowSizeClass == WindowSizeClass.MEDIUM) 32.dp else 100.dp,
                                vertical = 32.dp
                            ),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(
                            if (windowSizeClass == WindowSizeClass.MEDIUM) 32.dp else 48.dp
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
