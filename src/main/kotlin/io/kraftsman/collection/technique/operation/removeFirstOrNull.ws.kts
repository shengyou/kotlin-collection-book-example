package io.kraftsman.collection.technique.operation

/**
 * removeFistOrNull() - 移除集合裡第一個元素，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)
val emptyListOfNumbers = mutableListOf<Int>()

// 示範使用方式
numbers.removeFirstOrNull()
println(numbers)

emptyListOfNumbers.removeFirstOrNull()
println(emptyListOfNumbers)
