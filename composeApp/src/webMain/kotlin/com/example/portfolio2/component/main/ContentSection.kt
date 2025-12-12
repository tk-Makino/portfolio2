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

@Composable
fun ContentSection(selectedTabIndex: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(100.dp)
    ) {
        when (selectedTabIndex) {
            0 -> ProfileContent()
            1 -> SkillsContent()
            2 -> CareerContent()
        }
    }
}

