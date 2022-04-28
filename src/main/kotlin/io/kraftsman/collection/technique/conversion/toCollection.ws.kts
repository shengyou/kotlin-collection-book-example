package io.kraftsman.collection.technique.conversion

/**
 * toCollection() - 把元素寫進指定的可變集合裡
 */

// 建立範例資料
val listOfNumbers = listOf(1, 2, 3, 4, 5)
val emptyDestination = mutableListOf<Int>()
val prefilledDestination = mutableListOf(1, 2, 3)

// 測試 APIs
listOfNumbers.toCollection(mutableListOf())
listOfNumbers.toCollection(emptyDestination)
listOfNumbers.toCollection(prefilledDestination)

// 注意！
val booleanSet = setOf(true, false)
booleanSet.toCollection(mutableListOf(1, 2, 3))
