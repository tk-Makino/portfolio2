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
import androidx.compose.ui.unit.sp
import com.example.portfolio2.JapaneseFonts
import com.example.portfolio2.`object`.FooterObject
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
                // 追加情報
                Text(
                    text = FooterObject.BUILT_INFORMATION,
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
