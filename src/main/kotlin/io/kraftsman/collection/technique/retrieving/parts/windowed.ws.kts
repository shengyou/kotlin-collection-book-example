package io.kraftsman.collection.technique.retrieving.parts

/**
 * windowed() - 依指定尺寸及步數移動截取 Collection 元素
 */

// 建立範例資料
val strings = listOf("one", "two", "three", "four", "five")
val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// 測試 APIs
strings.windowed(3)
numbers.windowed(3, step = 2, partialWindows = true)
numbers.windowed(3, step = 2, partialWindows = false)
numbers.windowed(3) { it.sum() }
