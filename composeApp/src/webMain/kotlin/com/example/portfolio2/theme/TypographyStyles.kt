package com.example.portfolio2.theme

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.portfolio2.util.WindowSizeClass

/**
 * デザインシステム - タイポグラフィ定義
 * 
 * アプリケーション全体で使用するフォントサイズを一元管理します。
 * レスポンシブデザインに対応し、WindowSizeClassに応じた値を提供します。
 */
object TypographyStyles {
    
    /**
     * 大見出し（プロフィール名など）
     */
    fun titleLarge(windowSizeClass: WindowSizeClass): TextUnit = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 24.sp
        WindowSizeClass.MEDIUM -> 28.sp
        WindowSizeClass.EXPANDED -> 32.sp
    }
    
    /**
     * 中見出し/サブタイトル（Twitter IDなど）
     */
    fun titleMedium(windowSizeClass: WindowSizeClass): TextUnit = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 14.sp
        WindowSizeClass.MEDIUM -> 16.sp
        WindowSizeClass.EXPANDED -> 18.sp
    }
    
    /**
     * 本文テキスト
     */
    fun body(windowSizeClass: WindowSizeClass): TextUnit = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 14.sp
        WindowSizeClass.MEDIUM -> 15.sp
        WindowSizeClass.EXPANDED -> 16.sp
    }
    
    /**
     * 小さなテキスト（フッター情報など）
     */
    fun caption(windowSizeClass: WindowSizeClass): TextUnit = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> 10.sp
        else -> 12.sp
    }
}
