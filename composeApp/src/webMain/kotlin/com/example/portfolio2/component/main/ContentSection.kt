package com.example.portfolio2.component.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.portfolio2.component.main.content.AchievementContent
import com.example.portfolio2.component.main.content.ProfileContent
import com.example.portfolio2.theme.ThemeSpacing
import com.example.portfolio2.util.WindowSizeClass

@Composable
fun ContentSection(
    selectedTabIndex: Int,
    windowSizeClass: WindowSizeClass
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(ThemeSpacing.HorizontalPadding.contentSection(windowSizeClass))
    ) {
        when (selectedTabIndex) {
            0 -> ProfileContent(windowSizeClass)
            1 -> AchievementContent(windowSizeClass)
        }
    }
}

