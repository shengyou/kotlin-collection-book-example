package io.kraftsman.collection.technique.operation

/**
 * removeAll() - 從集合裡移除數個元素
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
numbers.removeAll(listOf(2, 3, 7))
println(numbers)

names.removeAll { it.contains('o') }
println(names)
