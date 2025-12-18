package com.example.portfolio2

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import portfolio2.composeapp.generated.resources.*

/**
 * 日本語フォントファミリーの定義
 */
object JapaneseFonts {
    /**
     * Noto Sans JP - ゴシック体（サンセリフ）
     * 読みやすく、UI全般に適したフォント
     */
    @Composable
    fun notoSans() = FontFamily(
        Font(Res.font.NotoSansJP)
    )
}

