package io.kraftsman.collection.technique.aggregation

/**
 * min() - 找出集合裡最小的元素，若是 Empty 集合則拋出 NoSuchElementException
 */

// 建立範例資料
val numbers = listOf(20, 47, 8, 39, 13)
val emptyListOfNumbers = emptyList<Int>()
val listOfNothing = listOf<Int>()

// 示範使用方式
numbers.min()
emptyListOfNumbers.min()
listOfNothing.min()
