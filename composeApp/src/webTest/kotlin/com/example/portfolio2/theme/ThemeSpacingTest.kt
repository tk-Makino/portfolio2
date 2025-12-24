package com.example.portfolio2.theme

import androidx.compose.ui.unit.dp
import com.example.portfolio2.util.WindowSizeClass
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * ThemeSpacing のテスト
 */
class ThemeSpacingTest {

    @Test
    fun testHorizontalPaddingPage() {
        assertEquals(16.dp, ThemeSpacing.HorizontalPadding.page(WindowSizeClass.COMPACT))
        assertEquals(32.dp, ThemeSpacing.HorizontalPadding.page(WindowSizeClass.MEDIUM))
        assertEquals(100.dp, ThemeSpacing.HorizontalPadding.page(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testHorizontalPaddingContainer() {
        assertEquals(16.dp, ThemeSpacing.HorizontalPadding.container(WindowSizeClass.COMPACT))
        assertEquals(32.dp, ThemeSpacing.HorizontalPadding.container(WindowSizeClass.MEDIUM))
        assertEquals(100.dp, ThemeSpacing.HorizontalPadding.container(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testHorizontalPaddingTab() {
        assertEquals(8.dp, ThemeSpacing.HorizontalPadding.tab(WindowSizeClass.COMPACT))
        assertEquals(24.dp, ThemeSpacing.HorizontalPadding.tab(WindowSizeClass.MEDIUM))
        assertEquals(100.dp, ThemeSpacing.HorizontalPadding.tab(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testHorizontalPaddingTabItem() {
        assertEquals(16.dp, ThemeSpacing.HorizontalPadding.tabItem(WindowSizeClass.COMPACT))
        assertEquals(20.dp, ThemeSpacing.HorizontalPadding.tabItem(WindowSizeClass.MEDIUM))
        assertEquals(24.dp, ThemeSpacing.HorizontalPadding.tabItem(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testHorizontalPaddingContentSection() {
        assertEquals(16.dp, ThemeSpacing.HorizontalPadding.contentSection(WindowSizeClass.COMPACT))
        assertEquals(32.dp, ThemeSpacing.HorizontalPadding.contentSection(WindowSizeClass.MEDIUM))
        assertEquals(50.dp, ThemeSpacing.HorizontalPadding.contentSection(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testVerticalPaddingHeader() {
        assertEquals(24.dp, ThemeSpacing.VerticalPadding.header(WindowSizeClass.COMPACT))
        assertEquals(32.dp, ThemeSpacing.VerticalPadding.header(WindowSizeClass.MEDIUM))
        assertEquals(32.dp, ThemeSpacing.VerticalPadding.header(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testVerticalPaddingFooter() {
        assertEquals(24.dp, ThemeSpacing.VerticalPadding.footer(WindowSizeClass.COMPACT))
        assertEquals(32.dp, ThemeSpacing.VerticalPadding.footer(WindowSizeClass.MEDIUM))
        assertEquals(32.dp, ThemeSpacing.VerticalPadding.footer(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testVerticalPaddingTab() {
        assertEquals(8.dp, ThemeSpacing.VerticalPadding.tab(WindowSizeClass.COMPACT))
        assertEquals(12.dp, ThemeSpacing.VerticalPadding.tab(WindowSizeClass.MEDIUM))
        assertEquals(12.dp, ThemeSpacing.VerticalPadding.tab(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testVerticalPaddingTabItem() {
        assertEquals(12.dp, ThemeSpacing.VerticalPadding.tabItem(WindowSizeClass.COMPACT))
        assertEquals(16.dp, ThemeSpacing.VerticalPadding.tabItem(WindowSizeClass.MEDIUM))
        assertEquals(16.dp, ThemeSpacing.VerticalPadding.tabItem(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testSpacingHeader() {
        assertEquals(16.dp, ThemeSpacing.Spacing.header(WindowSizeClass.COMPACT))
        assertEquals(32.dp, ThemeSpacing.Spacing.header(WindowSizeClass.MEDIUM))
        assertEquals(48.dp, ThemeSpacing.Spacing.header(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testSpacingContent() {
        assertEquals(12.dp, ThemeSpacing.Spacing.content(WindowSizeClass.COMPACT))
        assertEquals(16.dp, ThemeSpacing.Spacing.content(WindowSizeClass.MEDIUM))
        assertEquals(16.dp, ThemeSpacing.Spacing.content(WindowSizeClass.EXPANDED))
    }

    @Test
    fun testSpacingSmall() {
        assertEquals(8.dp, ThemeSpacing.Spacing.small)
    }

    @Test
    fun testSpacingMedium() {
        assertEquals(16.dp, ThemeSpacing.Spacing.medium)
    }

    @Test
    fun testIconSizeProfile() {
        assertEquals(100.dp, ThemeSpacing.IconSize.profile(WindowSizeClass.COMPACT))
        assertEquals(110.dp, ThemeSpacing.IconSize.profile(WindowSizeClass.MEDIUM))
        assertEquals(120.dp, ThemeSpacing.IconSize.profile(WindowSizeClass.EXPANDED))
    }
}
