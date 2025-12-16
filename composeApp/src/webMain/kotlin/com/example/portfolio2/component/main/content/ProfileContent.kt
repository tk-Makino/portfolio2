package com.example.portfolio2.component.main.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portfolio2.JapaneseFonts
import com.example.portfolio2.util.WindowSizeClass

@Composable
fun ProfileContent(windowSizeClass: WindowSizeClass) {
    val titleFontSize = ContentStyles.getTitleFontSize(windowSizeClass)
    val bodyFontSize = ContentStyles.getBodyFontSize(windowSizeClass)
    val spacing = ContentStyles.getSpacing(windowSizeClass)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(spacing)
    ) {
        Text(
            text = "プロフィール",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = titleFontSize,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "ここにプロフィールの詳細を記載します。",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = bodyFontSize,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "趣味や興味のあること、好きな技術などを書くことができます。",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = bodyFontSize,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f)
        )
    }
}

