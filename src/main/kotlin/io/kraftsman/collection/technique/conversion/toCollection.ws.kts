package io.kraftsman.collection.technique.conversion

/**
 * toCollection() - 把元素寫進指定的 Mutable Collection 裡
 */

// 建立範例資料
val numberList = listOf(1, 2, 3, 4, 5)
val emptyDestination = mutableListOf<Int>()
val prefillDestination = mutableListOf(1, 2, 3)

// 測試 APIs
numberList.toCollection(mutableListOf())
numberList.toCollection(emptyDestination)
numberList.toCollection(prefillDestination)

// 注意！
val booleanSet = setOf(true, false)
booleanSet.toCollection(mutableListOf(1, 2, 3))
