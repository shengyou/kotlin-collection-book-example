package io.kraftsman.collection.technique.operation

/**
 * fill() - 以固定值填充集合的內容
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)
val numberArray = intArrayOf(1, 3, 5, 7, 9)

// 示範使用方式
numbers.fill(10)
println(numbers)

numberArray.fill(10, 0, 2)
numberArray.contentToString()
