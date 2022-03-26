package io.kraftsman.collection.technique.retrieving.parts

/**
 * dropLastWhile() - 依 λ 從後面丟棄直到遇到第一個 False
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
numbers.dropLastWhile {
    it.startsWith('s') or it.startsWith('f')
}
