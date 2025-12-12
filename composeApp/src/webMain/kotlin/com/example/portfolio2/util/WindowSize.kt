package com.example.portfolio2.util

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * ウィンドウサイズの分類
 *
 */
enum class WindowSizeClass {
    COMPACT,  // モバイル: 0-599dp
    MEDIUM,   // タブレット: 600-839dp
    EXPANDED  // デスクトップ: 840dp以上
}

/**
 * 幅からWindowSizeClassを計算
 */
fun calculateWindowSizeClass(width: Dp): WindowSizeClass {
    return when {
        width < 600.dp -> WindowSizeClass.COMPACT
        width < 840.dp -> WindowSizeClass.MEDIUM
        else -> WindowSizeClass.EXPANDED
    }
}

