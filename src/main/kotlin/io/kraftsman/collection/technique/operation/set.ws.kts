package io.kraftsman.collection.technique.operation

/**
 * set() - 更新索引位置的元素，並回傳更新前的元素
 */

// 建立範例資料
val numbers = mutableListOf(1, 2, 3, 4, 5)

// 測試 APIs
numbers.set(2, 100)
println(numbers)
