package com.example.portfolio2.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portfolio2.JapaneseFonts
import com.example.portfolio2.util.WindowSizeClass
import com.example.portfolio2.util.calculateWindowSizeClass

/**
 * フッターコンポーネント
 * サイト下部に表示される情報エリア
 */
@Composable
fun Footer() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surfaceVariant,
        tonalElevation = 2.dp
    ) {
        BoxWithConstraints(
            modifier = Modifier.fillMaxWidth()
        ) {
            val windowSizeClass = calculateWindowSizeClass(maxWidth)

            val horizontalPadding = when (windowSizeClass) {
                WindowSizeClass.COMPACT -> 16.dp
                WindowSizeClass.MEDIUM -> 32.dp
                WindowSizeClass.EXPANDED -> 100.dp
            }

            val verticalPadding = when (windowSizeClass) {
                WindowSizeClass.COMPACT -> 24.dp
                else -> 32.dp
            }

            val linkSpacing = when (windowSizeClass) {
                WindowSizeClass.COMPACT -> 16.dp
                WindowSizeClass.MEDIUM -> 20.dp
                WindowSizeClass.EXPANDED -> 24.dp
            }

            val copyrightFontSize = when (windowSizeClass) {
                WindowSizeClass.COMPACT -> 12.sp
                else -> 14.sp
            }

            val infoFontSize = when (windowSizeClass) {
                WindowSizeClass.COMPACT -> 10.sp
                else -> 12.sp
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = verticalPadding, horizontal = horizontalPadding),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // SNSリンクセクション
                if (windowSizeClass == WindowSizeClass.COMPACT) {
                    // モバイル: 2列のグリッドレイアウト
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(linkSpacing),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            FooterLink("GitHub", "🔗", windowSizeClass)
                            FooterLink("LinkedIn", "💼", windowSizeClass)
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(linkSpacing),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            FooterLink("Twitter", "🐦", windowSizeClass)
                            FooterLink("Email", "📧", windowSizeClass)
                        }
                    }
                } else {
                    // タブレット・デスクトップ: 横並び
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(linkSpacing),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        FooterLink("GitHub", "🔗", windowSizeClass)
                        FooterLink("LinkedIn", "💼", windowSizeClass)
                        FooterLink("Twitter", "🐦", windowSizeClass)
                        FooterLink("Email", "📧", windowSizeClass)
                    }
                }

                // 区切り線
                Spacer(modifier = Modifier.height(8.dp))

                // コピーライト
                Text(
                    text = "© 2025 山田 太郎. All rights reserved.",
                    fontFamily = JapaneseFonts.notoSans(),
                    fontSize = copyrightFontSize,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                // 追加情報
                Text(
                    text = "Built with Kotlin Multiplatform & Compose",
                    fontFamily = JapaneseFonts.notoSans(),
                    fontSize = infoFontSize,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
fun FooterLink(text: String, icon: String, windowSizeClass: WindowSizeClass) {
    val iconSize = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 14.sp
        else -> 16.sp
    }

    val textSize = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 12.sp
        WindowSizeClass.MEDIUM -> 13.sp
        WindowSizeClass.EXPANDED -> 14.sp
    }

    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = icon,
            fontSize = iconSize
        )
        Text(
            text = text,
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = textSize,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

