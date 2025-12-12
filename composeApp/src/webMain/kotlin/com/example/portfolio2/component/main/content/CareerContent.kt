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

@Composable
fun CareerContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "経歴",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "ここに職歴や学歴、プロジェクト経験などを記載します。",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "時系列で整理して、分かりやすく記載しましょう。",
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f)
        )
    }
}

