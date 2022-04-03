package io.kraftsman.collection.technique.operation

/**
 * sort() - 依 Natural Order 正向排序
 */

// 建立範例資料
val numbers = mutableListOf(4, 1, 3, 5, 2)
val chars = mutableListOf('b', 'e', 'a', 'd', 'c')
val intArray = intArrayOf(4, 1, 5, 3, 2)

// 測試 APIs
numbers.sort()
chars.sort()
intArray.sort(0, 3)
