package io.kraftsman.collection.technique.operation

/**
 * remove() - 移除集合裡的元素
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 測試 APIs
numbers.remove(3)
println(numbers)

numbers.remove(100)
println(numbers)
