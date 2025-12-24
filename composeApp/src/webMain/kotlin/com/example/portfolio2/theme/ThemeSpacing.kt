package com.example.portfolio2.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.portfolio2.util.WindowSizeClass

/**
 * デザインシステム - スペーシング定義
 * 
 * アプリケーション全体で使用するスペーシング値を一元管理します。
 * レスポンシブデザインに対応し、WindowSizeClassに応じた値を提供します。
 */
object ThemeSpacing {
    
    /**
     * 水平パディング
     */
    object HorizontalPadding {
        /**
         * ページコンテンツの水平パディング
         */
        fun page(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 16.dp
            WindowSizeClass.MEDIUM -> 32.dp
            WindowSizeClass.EXPANDED -> 100.dp
        }
        
        /**
         * ヘッダー/フッター用の水平パディング
         */
        fun container(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 16.dp
            WindowSizeClass.MEDIUM -> 32.dp
            WindowSizeClass.EXPANDED -> 100.dp
        }
        
        /**
         * タブセクションの水平パディング
         */
        fun tab(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 8.dp
            WindowSizeClass.MEDIUM -> 24.dp
            WindowSizeClass.EXPANDED -> 100.dp
        }
        
        /**
         * タブアイテムの水平パディング
         */
        fun tabItem(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 16.dp
            WindowSizeClass.MEDIUM -> 20.dp
            WindowSizeClass.EXPANDED -> 24.dp
        }
        
        /**
         * コンテンツセクションの水平パディング
         */
        fun contentSection(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 16.dp
            WindowSizeClass.MEDIUM -> 32.dp
            WindowSizeClass.EXPANDED -> 50.dp
        }
    }
    
    /**
     * 垂直パディング
     */
    object VerticalPadding {
        /**
         * ヘッダーの垂直パディング
         */
        fun header(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 24.dp
            else -> 32.dp
        }
        
        /**
         * フッターの垂直パディング
         */
        fun footer(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 24.dp
            else -> 32.dp
        }
        
        /**
         * タブセクションの垂直パディング
         */
        fun tab(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 8.dp
            else -> 12.dp
        }
        
        /**
         * タブアイテムの垂直パディング
         */
        fun tabItem(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 12.dp
            else -> 16.dp
        }
    }
    
    /**
     * スペーシング（要素間の間隔）
     */
    object Spacing {
        /**
         * ヘッダー内の要素間スペース
         */
        fun header(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 16.dp
            WindowSizeClass.MEDIUM -> 32.dp
            WindowSizeClass.EXPANDED -> 48.dp
        }
        
        /**
         * コンテンツ要素間の標準スペース
         */
        fun content(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 12.dp
            else -> 16.dp
        }
        
        /**
         * 小さな要素間のスペース（例：プロフィール情報内）
         */
        val small: Dp = 8.dp
        
        /**
         * 通常の要素間のスペース
         */
        val medium: Dp = 16.dp
    }
    
    /**
     * アイコンサイズ
     */
    object IconSize {
        /**
         * プロフィールアイコンのサイズ
         */
        fun profile(windowSizeClass: WindowSizeClass): Dp = when (windowSizeClass) {
            WindowSizeClass.COMPACT -> 100.dp
            WindowSizeClass.MEDIUM -> 110.dp
            WindowSizeClass.EXPANDED -> 120.dp
        }
    }
}
