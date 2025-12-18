package com.example.portfolio2.component.main.content

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portfolio2.util.WindowSizeClass

/**
 * コンテンツページで使用する共通のスタイル定義
 */
object ContentStyles {

    /**
     * ウィンドウサイズに応じたタイトルフォントサイズを取得
     */
    fun getTitleFontSize(windowSizeClass: WindowSizeClass): TextUnit {
        return when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 20.sp
            WindowSizeClass.MEDIUM -> 24.sp
            WindowSizeClass.EXPANDED -> 28.sp
        }
    }

    /**
     * ウィンドウサイズに応じた本文フォントサイズを取得
     */
    fun getBodyFontSize(windowSizeClass: WindowSizeClass): TextUnit {
        return when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 14.sp
            WindowSizeClass.MEDIUM -> 15.sp
            WindowSizeClass.EXPANDED -> 16.sp
        }
    }

    /**
     * ウィンドウサイズに応じたスペーシングを取得
     */
    fun getSpacing(windowSizeClass: WindowSizeClass): Dp {
        return when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 12.dp
            else -> 16.dp
        }
    }
}

