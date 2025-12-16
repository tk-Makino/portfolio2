package com.example.portfolio2.component.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.portfolio2.component.main.content.CareerContent
import com.example.portfolio2.component.main.content.ProfileContent
import com.example.portfolio2.component.main.content.SkillsContent
import com.example.portfolio2.util.WindowSizeClass

@Composable
fun ContentSection(
    selectedTabIndex: Int,
    windowSizeClass: WindowSizeClass
) {
    val padding = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 16.dp
        WindowSizeClass.MEDIUM -> 32.dp
        WindowSizeClass.EXPANDED -> 100.dp
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
    ) {
        when (selectedTabIndex) {
            0 -> ProfileContent(windowSizeClass)
            1 -> SkillsContent(windowSizeClass)
            2 -> CareerContent(windowSizeClass)
        }
    }
}

