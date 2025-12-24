package com.example.portfolio2.component.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.example.portfolio2.theme.ThemeSpacing
import com.example.portfolio2.util.WindowSizeClass
import org.jetbrains.compose.resources.painterResource
import portfolio2.composeapp.generated.resources.Res
import portfolio2.composeapp.generated.resources.profile

/**
 * プロフィールアイコンコンポーネント
 * 円形のプロフィール画像を表示
 */
@Composable
fun ProfileIcon(windowSizeClass: WindowSizeClass) {
    val iconSize = ThemeSpacing.IconSize.profile(windowSizeClass)

    Box(
        modifier = Modifier
            .size(iconSize)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary),
        contentAlignment = Alignment.Center
    ) {
        val painter = painterResource(Res.drawable.profile)
        Image(
            painter = painter,
            contentDescription = "twitter icon",
        )
    }
}