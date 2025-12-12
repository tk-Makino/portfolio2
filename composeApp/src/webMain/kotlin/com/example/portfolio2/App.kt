package com.example.portfolio2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.portfolio2.component.Footer
import com.example.portfolio2.component.header.Header
import com.example.portfolio2.component.main.MainContent

@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // ヘッダー
        Header()

        // 中央部
        MainContent()

        // フッター
        Footer()
    }
}

