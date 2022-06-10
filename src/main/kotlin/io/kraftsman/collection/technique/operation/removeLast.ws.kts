package io.kraftsman.collection.technique.operation

/**
 * removeLast() - 移除集合裡最後一個元素，若是 Empty 集合則拋 NoSuchElementException
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 示範使用方式
numbers.removeLast()
println(numbers)
