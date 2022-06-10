package io.kraftsman.collection.technique.operation

/**
 * removeAt() - 刪除集合裡指定索引位置的元素，若索引超出範圍則拋出 IndexOutOfBoundsException
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 示範使用方式
numbers.removeAt(1)
println(numbers)
