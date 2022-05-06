package io.kraftsman.collection.technique.operation

/**
 * shuffle() - 隨機排列集合裡元素的順序
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 測試 APIs
numbers.shuffle()
println(numbers)
