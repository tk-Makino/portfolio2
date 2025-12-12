package com.example.portfolio2.component.main

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.portfolio2.component.main.tab.TabSection

/**
 * メインコンテンツ領域
 * タブセクションとコンテンツセクションを統合
 */
@Composable
fun ColumnScope.MainContent() {
    var selectedTabIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
    ) {
        // タブ部分
        TabSection(
            selectedTabIndex = selectedTabIndex,
            onTabSelected = { selectedTabIndex = it }
        )

        // コンテンツ部分
        ContentSection(selectedTabIndex = selectedTabIndex)
    }
}


