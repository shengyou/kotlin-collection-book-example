package io.kraftsman.collection.technique.operation

/**
 * sortDescending() - 依自然排序反向排序
 */

// 建立範例資料
val numbers = mutableListOf(4, 1, 3, 5, 2)
val chars = mutableListOf('b', 'e', 'a', 'd', 'c')
val strings = mutableListOf(
    "cherry",
    "apple",
    "banana",
    "grape",
    "papaya"
)
val intArray = intArrayOf(4, 1, 5, 3, 2)

// 測試 APIs
numbers.sortDescending()
println(numbers)

chars.sortDescending()
println(chars)

strings.sortDescending()
println(strings)

intArray.sortDescending(0, 3)
intArray.contentToString()
