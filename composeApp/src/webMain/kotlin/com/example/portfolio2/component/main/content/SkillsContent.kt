package com.example.portfolio2.component.main.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.portfolio2.JapaneseFonts
import com.example.portfolio2.util.WindowSizeClass

@Composable
fun SkillsContent(windowSizeClass: WindowSizeClass) {
    val titleFontSize = ContentStyles.getTitleFontSize(windowSizeClass)
    val bodyFontSize = ContentStyles.getBodyFontSize(windowSizeClass)
    val spacing = ContentStyles.getSpacing(windowSizeClass)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(spacing)
    ) {
        Text(
            text = "スキル",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = titleFontSize,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "ここに保有しているスキルや技術スタックを記載します。",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = bodyFontSize,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "例：Kotlin, Compose Multiplatform, React, TypeScript など",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = bodyFontSize,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f)
        )
    }
}

