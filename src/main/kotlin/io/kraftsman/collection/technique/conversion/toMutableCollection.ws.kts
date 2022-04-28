package io.kraftsman.collection.technique.conversion

/**
 * toMutableList() - 轉換成 MutableList
 * toMutableSet() - 轉換成 MutableSet
 * toMutableMap() - 轉換成 MutableMap
 * toHashSet() - 轉換成 HashSet
 */

// 建立範例資料
val listOfNumbers = listOf(1, 2, 3, 4, 5)
val setOfNumbers = setOf(1, 2, 3, 4, 5)
val mapOfWarehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

// 測試 APIs
val mutableList = listOfNumbers.toMutableList()
mutableList.addAll(listOf(6, 7, 8, 9, 10))
println(mutableList)

val mutableSet = setOfNumbers.toMutableSet()
mutableSet.addAll(setOf(6, 7, 8, 9, 10))
println(mutableSet)

val mutableMap = mapOfWarehouse.toMutableMap()
mutableMap.put("Papaya", 4)
println(mutableMap)

val hashSet = mutableList.toHashSet()
hashSet.add(6)
println(hashSet)
