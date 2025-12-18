package com.example.portfolio2.component.main.content

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.example.portfolio2.theme.ThemeSpacing
import com.example.portfolio2.theme.TypographyStyles
import com.example.portfolio2.util.WindowSizeClass

/**
 * コンテンツページで使用する共通のスタイル定義
 */
object ContentStyles {

    /**
     * ウィンドウサイズに応じた本文フォントサイズを取得
     */
    fun getBodyFontSize(windowSizeClass: WindowSizeClass): TextUnit {
        return TypographyStyles.body(windowSizeClass)
    }

    /**
     * ウィンドウサイズに応じたスペーシングを取得
     */
    fun getSpacing(windowSizeClass: WindowSizeClass): Dp {
        return ThemeSpacing.Spacing.content(windowSizeClass)
    }
}

