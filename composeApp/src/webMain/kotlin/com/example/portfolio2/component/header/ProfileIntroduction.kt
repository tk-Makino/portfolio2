package com.example.portfolio2.component.header

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
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

@Composable
fun ProfileIntroduction(windowSizeClass: WindowSizeClass) {
    val titleFontSize = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 24.sp
        WindowSizeClass.MEDIUM -> 28.sp
        WindowSizeClass.EXPANDED -> 32.sp
    }

    val subtitleFontSize = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 14.sp
        WindowSizeClass.MEDIUM -> 16.sp
        WindowSizeClass.EXPANDED -> 18.sp
    }

    val descriptionFontSize = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 12.sp
        WindowSizeClass.MEDIUM -> 13.sp
        WindowSizeClass.EXPANDED -> 14.sp
    }

    val textAlign = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> TextAlign.Center
        else -> TextAlign.Start
    }

    val horizontalAlignment = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> Alignment.CenterHorizontally
        else -> Alignment.Start
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = horizontalAlignment
    ) {
        Text(
            text = "山田 太郎",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = titleFontSize,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            textAlign = textAlign,
            modifier = if (windowSizeClass == WindowSizeClass.COMPACT) Modifier.fillMaxWidth() else Modifier
        )

        Text(
            text = "フルスタックエンジニア | Kotlin Multiplatform愛好家",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = subtitleFontSize,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            textAlign = textAlign,
            modifier = if (windowSizeClass == WindowSizeClass.COMPACT) Modifier.fillMaxWidth() else Modifier
        )

        Text(
            text = "Webアプリケーション開発を中心に、モダンな技術を使った開発を行っています。",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = descriptionFontSize,
            color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.8f),
            textAlign = textAlign,
            modifier = if (windowSizeClass == WindowSizeClass.COMPACT) Modifier.fillMaxWidth() else Modifier
        )
    }
}