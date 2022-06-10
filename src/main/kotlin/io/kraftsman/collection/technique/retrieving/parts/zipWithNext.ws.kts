package io.kraftsman.collection.technique.retrieving.parts

/**
 * zipWithNext() - 將前後相鄰的兩個元素、每次移動一格配對成 Pair 回傳
 */

// 建立範例資料
val numbers = listOf(1, 2, 3, 4, 5)

// 示範使用方式
numbers.zipWithNext()
numbers.zipWithNext { a, b -> a * b }
