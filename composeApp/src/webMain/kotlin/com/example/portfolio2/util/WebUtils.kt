package com.example.portfolio2.util

// External function to open URL in browser
external fun eval(code: String)

/**
 * 外部URLをブラウザの新しいタブで開く
 *
 * @param url 開くURL
 */
fun openExternalUrl(url: String) {
    eval("window.open('$url', '_blank')")
}
