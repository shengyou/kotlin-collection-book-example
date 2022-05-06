package io.kraftsman.collection.technique.operation

/**
 * sort() - 依自然排序正向排序
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
numbers.sort()
println(numbers)

chars.sort()
println(chars)

strings.sort()
println(strings)

intArray.sort(0, 3)
intArray.contentToString()
