package com.example.portfolio2.component.header

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.portfolio2.JapaneseFonts
import com.example.portfolio2.`object`.ProfileIntroductionObject
import com.example.portfolio2.theme.ThemeSpacing
import com.example.portfolio2.theme.TypographyStyles
import com.example.portfolio2.util.WindowSizeClass
import com.example.portfolio2.util.openExternalUrl

@Composable
fun ProfileIntroduction(windowSizeClass: WindowSizeClass) {
    val titleFontSize = TypographyStyles.titleLarge(windowSizeClass)
    val subtitleFontSize = TypographyStyles.titleMedium(windowSizeClass)

    val textAlign = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> TextAlign.Center
        else -> TextAlign.Start
    }

    val horizontalAlignment = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> Alignment.CenterHorizontally
        else -> Alignment.Start
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(ThemeSpacing.Spacing.small),
        horizontalAlignment = horizontalAlignment
    ) {
        // Name
        Text(
            text = ProfileIntroductionObject.TWITTER_NAME,
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = titleFontSize,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            textAlign = textAlign,
            modifier = modifierForCompact(windowSizeClass)
        )

        // Twitter ID
        Text(
            text = ProfileIntroductionObject.TWITTER_ID,
            fontFamily = JapaneseFonts.notoSans(),
            fontSize = subtitleFontSize,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            textAlign = textAlign,
            modifier = modifierForCompact(windowSizeClass)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(
                space = ThemeSpacing.Spacing.medium,
                alignment = alignmentForWindow(windowSizeClass)
            ),
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifierForCompact(windowSizeClass)
        ) {
            // Twitter Link
            Text(
                text = ProfileIntroductionObject.TWITTER,
                fontFamily = JapaneseFonts.notoSans(),
                fontSize = subtitleFontSize,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.clickable {
                    openExternalUrl(ProfileIntroductionObject.TWITTER_URL)
                }
            )

            // GitHub Link
            Text(
                text = ProfileIntroductionObject.GITHUB,
                fontFamily = JapaneseFonts.notoSans(),
                fontSize = subtitleFontSize,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.clickable {
                    openExternalUrl(ProfileIntroductionObject.GITHUB_URL)
                }
            )
        }
    }
}

/**
 * WindowSizeClass が COMPACT の場合に幅いっぱいに広げる Modifier を返す
 *
 */
private fun modifierForCompact(
    windowSizeClass: WindowSizeClass
): Modifier =
    if (windowSizeClass == WindowSizeClass.COMPACT)
        Modifier.fillMaxWidth()
    else Modifier


/**
 * WindowSizeClass に応じた水平配置を返す
 *
 * Compact の場合は中央寄せ、それ以外は左寄せ
 */
private fun alignmentForWindow(
    windowSizeClass: WindowSizeClass
): Alignment.Horizontal =
    if (windowSizeClass == WindowSizeClass.COMPACT)
        Alignment.CenterHorizontally
    else Alignment.Start