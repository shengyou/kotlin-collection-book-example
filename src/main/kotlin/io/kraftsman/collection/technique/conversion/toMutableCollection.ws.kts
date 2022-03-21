package io.kraftsman.collection.technique.conversion

/**
 * toMutableList() - 轉換成 MutableList
 * toMutableSet() - 轉換成 MutableSet
 * toMutableMap() - 轉換成 MutableMap
 * toHashSet() - 轉換成 HashSet
 */

// 建立範例資料
val numberList = listOf(1, 2, 3, 4, 5)
val numberSet = setOf(1, 2, 3, 4, 5)
val numberMap = mapOf(
    "one" to 1,
    "two" to 2,
    "three" to 3,
)

// 測試 APIs
val mutableList = numberList.toMutableList()
mutableList.addAll(listOf(6, 7, 8, 9, 10))

val mutableSet = numberSet.toMutableSet()
mutableSet.addAll(setOf(6, 7, 8, 9, 10))

val mutableMap = numberMap.toMutableMap()
mutableMap.put("four", 4)

val hashSet = mutableList.toHashSet()
hashSet.add(6)
