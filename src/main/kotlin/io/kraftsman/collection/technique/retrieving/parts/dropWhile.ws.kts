package io.kraftsman.collection.technique.retrieving.parts

/**
 * dropWhile() - 依 λ 丟棄直到遇到第一個 False
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
numbers.dropWhile {
    it.startsWith('o') or it.startsWith('t')
}
