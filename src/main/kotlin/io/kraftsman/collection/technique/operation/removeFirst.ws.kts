package io.kraftsman.collection.technique.operation

/**
 * removeFist() - 移除集合的第一個元素，若是 Empty 集合則拋 NoSuchElementException
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 測試 APIs
numbers.removeFirst()
println(numbers)
