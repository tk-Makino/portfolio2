package com.example.portfolio2.component.header

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.portfolio2.util.ResponsiveUtil

@Composable
fun Header() {
    val isMobile = ResponsiveUtil.isMobile()
    val horizontalPadding = ResponsiveUtil.getHorizontalPadding()

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.primaryContainer,
        tonalElevation = 2.dp
    ) {
        if (isMobile) {
            // モバイル: 縦並び
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = horizontalPadding, vertical = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ProfileIcon()
                ProfileIntroduction()
            }
        } else {
            // デスクトップ/タブレット: 横並び
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = horizontalPadding, vertical = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(48.dp)
            ) {
                ProfileIcon()
                ProfileIntroduction()
            }
        }
    }
}
