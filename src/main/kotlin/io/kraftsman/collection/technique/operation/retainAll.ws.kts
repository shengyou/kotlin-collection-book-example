package io.kraftsman.collection.technique.operation

/**
 * retainAll() - 保留集合裡的元素
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
numbers.retainAll(listOf(2, 5, 7))
println(numbers)

names.retainAll { it.contains('o') }
println(names)
