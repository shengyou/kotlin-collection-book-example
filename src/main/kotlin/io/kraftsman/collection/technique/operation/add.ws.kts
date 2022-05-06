package io.kraftsman.collection.technique.operation

/**
 * add() - 新增元素進集合
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 測試 APIs
numbers.add(8)
println(numbers)

numbers.add(2, 4)
println(numbers)
