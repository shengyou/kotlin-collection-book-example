package io.kraftsman.collection.technique.retrieving.parts

/**
 * takeWhile() - 依 λ 取值直到遇到第一個 False
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four", "five", "six")

// 測試 APIs
numbers.takeWhile {
    it.startsWith('o') or it.startsWith('t')
}
