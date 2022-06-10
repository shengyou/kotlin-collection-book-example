package io.kraftsman.collection.technique.operation

/**
 * addAll() - 新增數個元素至集合
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 示範使用方式
numbers.addAll(listOf(4, 6, 8))
println(numbers)

numbers.addAll(2, listOf(4, 6, 8))
println(numbers)
