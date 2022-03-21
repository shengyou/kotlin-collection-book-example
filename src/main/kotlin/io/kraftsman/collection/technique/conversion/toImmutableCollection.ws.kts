package io.kraftsman.collection.technique.conversion

/**
 * toList() - 轉換成 List
 * toSet() - 轉換成 Set
 * toMap() - 轉換成 Map
 */

// 建立範例資料
val numberSet = setOf(1, 2, 3, 4, 5)
val numberList = listOf(1, 1, 2, 3, 3, 4, 5)
val myPairList = listOf(
    Pair(1, "one"),
    Pair(2, "two"),
    Pair(3, "three"),
)

// 測試 APIs
numberSet.toList()
numberList.toSet()
myPairList.toMap()
