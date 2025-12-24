# Design System

このドキュメントは、portfolio2プロジェクトで使用されているデザインシステムについて説明します。

## 概要

デザインシステムは、アプリケーション全体で一貫したスタイルを提供し、コードの重複を削減するために導入されました。

## コンポーネント

### ThemeSpacing

スペーシング、パディング、アイコンサイズなどの空間に関する値を一元管理します。

#### 使用方法

```kotlin
import com.example.portfolio2.theme.ThemeSpacing

// 水平パディングの取得
val padding = ThemeSpacing.HorizontalPadding.container(windowSizeClass)

// 垂直パディングの取得
val verticalPadding = ThemeSpacing.VerticalPadding.header(windowSizeClass)

// スペーシングの取得
val spacing = ThemeSpacing.Spacing.content(windowSizeClass)

// アイコンサイズの取得
val iconSize = ThemeSpacing.IconSize.profile(windowSizeClass)
```

#### 提供される値

**水平パディング (HorizontalPadding)**
- `page(windowSizeClass)` - ページコンテンツの水平パディング
- `container(windowSizeClass)` - ヘッダー/フッター用の水平パディング
- `tab(windowSizeClass)` - タブセクションの水平パディング
- `tabItem(windowSizeClass)` - タブアイテムの水平パディング
- `contentSection(windowSizeClass)` - コンテンツセクションの水平パディング

**垂直パディング (VerticalPadding)**
- `header(windowSizeClass)` - ヘッダーの垂直パディング
- `footer(windowSizeClass)` - フッターの垂直パディング
- `tab(windowSizeClass)` - タブセクションの垂直パディング
- `tabItem(windowSizeClass)` - タブアイテムの垂直パディング

**スペーシング (Spacing)**
- `header(windowSizeClass)` - ヘッダー内の要素間スペース
- `content(windowSizeClass)` - コンテンツ要素間の標準スペース
- `small` - 小さな要素間のスペース (8dp)
- `medium` - 通常の要素間のスペース (16dp)

**アイコンサイズ (IconSize)**
- `profile(windowSizeClass)` - プロフィールアイコンのサイズ

### TypographyStyles

フォントサイズを一元管理します。

#### 使用方法

```kotlin
import com.example.portfolio2.theme.TypographyStyles

// タイトルのフォントサイズ
val titleSize = TypographyStyles.titleLarge(windowSizeClass)

// 本文のフォントサイズ
val bodySize = TypographyStyles.body(windowSizeClass)
```

#### 提供される値

- `titleLarge(windowSizeClass)` - 大見出し（プロフィール名など）
- `titleMedium(windowSizeClass)` - 中見出し/サブタイトル（Twitter IDなど）
- `body(windowSizeClass)` - 本文テキスト
- `caption(windowSizeClass)` - 小さなテキスト（フッター情報など）

## レスポンシブデザイン

すべての値は`WindowSizeClass`に応じて異なる値を返します：

- `WindowSizeClass.COMPACT` - モバイル
- `WindowSizeClass.MEDIUM` - タブレット
- `WindowSizeClass.EXPANDED` - デスクトップ

## 移行ガイド

既存のコードを新しいデザインシステムに移行する方法：

### Before (移行前)

```kotlin
val fontSize = when (windowSizeClass) {
    WindowSizeClass.COMPACT -> 14.sp
    WindowSizeClass.MEDIUM -> 15.sp
    WindowSizeClass.EXPANDED -> 16.sp
}

val padding = when (windowSizeClass) {
    WindowSizeClass.COMPACT -> 16.dp
    WindowSizeClass.MEDIUM -> 32.dp
    WindowSizeClass.EXPANDED -> 100.dp
}
```

### After (移行後)

```kotlin
import com.example.portfolio2.theme.ThemeSpacing
import com.example.portfolio2.theme.TypographyStyles

val fontSize = TypographyStyles.body(windowSizeClass)
val padding = ThemeSpacing.HorizontalPadding.container(windowSizeClass)
```

## テスト

デザインシステムの各コンポーネントには対応するテストが用意されています：

- `ThemeSpacingTest.kt` - ThemeSpacingのテスト
- `TypographyStylesTest.kt` - TypographyStylesのテスト

テストを実行：

```bash
./gradlew test
```

## 今後の拡張

デザインシステムは今後も拡張可能です：

- カラーパレットの追加
- アニメーション設定の追加
- シャドウ/エレベーション設定の追加
- ボーダー半径の統一
