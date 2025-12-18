# 日本語フォントの使用方法

このプロジェクトでは、複数の日本語フォントが使用できるようになっています。

## 利用可能なフォント

### Noto Sans JP（ゴシック体）
標準的なサンセリフフォント。UI全般に適しています。

```kotlin
Text(
    text = "テキスト",
    fontFamily = JapaneseFonts.notoSans()
)
```

## 新しいフォントの追加方法

1. フォントファイル（.ttf または .otf）を `composeApp/src/webMain/composeResources/font/` に配置
2. `Fonts.kt` に新しいフォントファミリーを追加：

```kotlin
@Composable
fun 新しいフォント名() = FontFamily(
    Font(Res.font.ファイル名)
)
```

3. プロジェクトをビルドしてリソースを生成：
```bash
.\gradlew :composeApp:compileKotlinWasmJs
```

4. アプリケーションで使用：
```kotlin
Text(
    text = "テキスト",
    fontFamily = JapaneseFonts.新しいフォント名()
)
```

## 注意事項

- フォントファイル名のハイフン（-）は自動的にアンダースコア（_）に変換されます
- リソース名はすべて小文字になります
- 例: `MPLUS1p-Regular.ttf` → `Res.font.mplus1p_regular`

## ビルドと実行

```bash
# WasmJS版の実行
.\gradlew :composeApp:wasmJsBrowserDevelopmentRun

# JavaScript版の実行
.\gradlew :composeApp:jsBrowserDevelopmentRun
```

