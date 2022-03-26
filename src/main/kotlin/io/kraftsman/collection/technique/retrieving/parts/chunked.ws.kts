package io.kraftsman.collection.technique.retrieving.parts

/**
 * chunked() - 依指定的尺寸及 λ 切小塊
 */

// 建立範例資料
val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// 測試 APIs
numbers.chunked(3)
numbers.chunked(3) { it.sum() }
