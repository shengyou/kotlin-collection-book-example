package io.kraftsman.collection.technique.retrieving.parts

/**
 * takeLastWhile() - 依 λ 從後面取值直到遇到第一個 False
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
numbers.takeLastWhile {
    it.startsWith('a') or it.startsWith('f')
}
