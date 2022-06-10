package io.kraftsman.collection.technique.operation

/**
 * removeLastOrNull() - 移除集合裡最後一個元素，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)
val emptyListOfNumbers = mutableListOf<Int>()

// 示範使用方式
numbers.removeLastOrNull()
println(numbers)

emptyListOfNumbers.removeLastOrNull()
println(emptyListOfNumbers)
