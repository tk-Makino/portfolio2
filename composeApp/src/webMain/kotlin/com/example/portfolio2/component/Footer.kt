package com.example.portfolio2.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.portfolio2.JapaneseFonts
import com.example.portfolio2.`object`.FooterObject
import com.example.portfolio2.theme.ThemeSpacing
import com.example.portfolio2.theme.TypographyStyles
import com.example.portfolio2.util.WindowSizeClass

/**
 * フッターコンポーネント
 * サイト下部に表示される情報エリア
 */
@Composable
fun Footer(windowSizeClass: WindowSizeClass) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surfaceVariant,
        tonalElevation = 2.dp
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        vertical = ThemeSpacing.VerticalPadding.footer(windowSizeClass),
                        horizontal = ThemeSpacing.HorizontalPadding.container(windowSizeClass)
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(ThemeSpacing.Spacing.medium)
            ) {
                // 追加情報
                Text(
                    text = FooterObject.BUILT_INFORMATION,
                    fontFamily = JapaneseFonts.notoSans(),
                    fontSize = TypographyStyles.caption(windowSizeClass),
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}
