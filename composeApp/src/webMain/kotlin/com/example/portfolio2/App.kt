package com.example.portfolio2

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        // Noto Sans JP - 標準的なゴシック体
        Text(
            text = "ほげ（Noto Sans JP）",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground
        )

        // M PLUS 1p - Regular
        Text(
            text = "ほげ（M PLUS 1p Regular）",
            fontFamily = JapaneseFonts.mplus1p(),
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground
        )

        // M PLUS 1p - Bold
        Text(
            text = "ほげ（M PLUS 1p Bold）",
            fontFamily = JapaneseFonts.mplus1p(),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        // より長いテキストの例
        Text(
            text = "これは日本語のテキストです。様々なフォントで表示できます。",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "漢字、ひらがな、カタカナ、すべて正しく表示されます！",
            fontFamily = JapaneseFonts.mplus1p(),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}