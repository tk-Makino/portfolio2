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
     * 共通のパディング計算ヘルパー関数
     * WindowSizeClassに応じて適切な値を返す
     */
    private fun getResponsivePadding(
        windowSizeClass: WindowSizeClass,
        compact: Dp,
        medium: Dp,
        expanded: Dp
    ): Dp = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> compact
        WindowSizeClass.MEDIUM -> medium
        WindowSizeClass.EXPANDED -> expanded
    }
    
    /**
     * 2段階のパディング計算ヘルパー関数（COMPACT vs その他）
     */
    private fun getResponsivePaddingTwoTier(
        windowSizeClass: WindowSizeClass,
        compact: Dp,
        other: Dp
    ): Dp = when (windowSizeClass) {
        WindowSizeClass.COMPACT -> compact
        else -> other
    }
    
    /**
     * 水平パディング
     */
    object HorizontalPadding {
        /**
         * ページコンテンツの水平パディング
         */
        fun page(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePadding(windowSizeClass, 16.dp, 32.dp, 100.dp)
        
        /**
         * ヘッダー/フッター用の水平パディング
         */
        fun container(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePadding(windowSizeClass, 16.dp, 32.dp, 100.dp)
        
        /**
         * タブセクションの水平パディング
         */
        fun tab(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePadding(windowSizeClass, 8.dp, 24.dp, 100.dp)
        
        /**
         * タブアイテムの水平パディング
         */
        fun tabItem(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePadding(windowSizeClass, 16.dp, 20.dp, 24.dp)
        
        /**
         * コンテンツセクションの水平パディング
         */
        fun contentSection(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePadding(windowSizeClass, 16.dp, 32.dp, 50.dp)
    }
    
    /**
     * 垂直パディング
     */
    object VerticalPadding {
        /**
         * ヘッダーの垂直パディング
         */
        fun header(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePaddingTwoTier(windowSizeClass, 24.dp, 32.dp)
        
        /**
         * フッターの垂直パディング
         */
        fun footer(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePaddingTwoTier(windowSizeClass, 24.dp, 32.dp)
        
        /**
         * タブセクションの垂直パディング
         */
        fun tab(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePaddingTwoTier(windowSizeClass, 8.dp, 12.dp)
        
        /**
         * タブアイテムの垂直パディング
         */
        fun tabItem(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePaddingTwoTier(windowSizeClass, 12.dp, 16.dp)
    }
    
    /**
     * スペーシング（要素間の間隔）
     */
    object Spacing {
        /**
         * ヘッダー内の要素間スペース
         */
        fun header(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePadding(windowSizeClass, 16.dp, 32.dp, 48.dp)
        
        /**
         * コンテンツ要素間の標準スペース
         */
        fun content(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePaddingTwoTier(windowSizeClass, 12.dp, 16.dp)
        
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
        fun profile(windowSizeClass: WindowSizeClass): Dp = 
            getResponsivePadding(windowSizeClass, 100.dp, 110.dp, 120.dp)
    }
}
