package com.example.portfolio2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.portfolio2.component.Footer
import com.example.portfolio2.component.header.Header
import com.example.portfolio2.component.main.MainContent
import com.example.portfolio2.util.calculateWindowSizeClass

@Composable
fun App() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // WindowSizeClassを一度だけ計算
        val windowSizeClass = calculateWindowSizeClass(maxWidth)
        
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // ヘッダー
            Header(windowSizeClass)

            // 中央部
            MainContent(windowSizeClass)

            // フッター
            Footer(windowSizeClass)
        }
    }
}

