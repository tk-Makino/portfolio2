package com.example.portfolio2.component.main.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.portfolio2.JapaneseFonts
import com.example.portfolio2.`object`.content.ProfileContentObject
import com.example.portfolio2.util.WindowSizeClass

/**
 * プロフィールコンテンツ
 *
 * @param windowSizeClass
 */
@Composable
fun ProfileContent(windowSizeClass: WindowSizeClass) {
    val bodyFontSize = ContentStyles.getBodyFontSize(windowSizeClass)
    val spacing = ContentStyles.getSpacing(windowSizeClass)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(spacing)
    ) {
        Text(
            text = ProfileContentObject.PROFILE_DETAIL,
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = bodyFontSize,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

