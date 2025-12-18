package com.example.portfolio2.theme

import androidx.compose.ui.unit.sp
import com.example.portfolio2.util.WindowSizeClass
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * TypographyStyles のテスト
 */
class TypographyStylesTest {

    @Test
    fun testTitleLarge() {
        assertEquals(24.sp, TypographyStyles.titleLarge(WindowSizeClass.COMPACT))
        assertEquals(28.sp, TypographyStyles.titleLarge(WindowSizeClass.MEDIUM))
        assertEquals(32.sp, TypographyStyles.titleLarge(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testTitleMedium() {
        assertEquals(14.sp, TypographyStyles.titleMedium(WindowSizeClass.COMPACT))
        assertEquals(16.sp, TypographyStyles.titleMedium(WindowSizeClass.MEDIUM))
        assertEquals(18.sp, TypographyStyles.titleMedium(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testBody() {
        assertEquals(14.sp, TypographyStyles.body(WindowSizeClass.COMPACT))
        assertEquals(15.sp, TypographyStyles.body(WindowSizeClass.MEDIUM))
        assertEquals(16.sp, TypographyStyles.body(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testCaption() {
        assertEquals(10.sp, TypographyStyles.caption(WindowSizeClass.COMPACT))
        assertEquals(12.sp, TypographyStyles.caption(WindowSizeClass.MEDIUM))
        assertEquals(12.sp, TypographyStyles.caption(WindowSizeClass.EXPANDED))
    }
}
