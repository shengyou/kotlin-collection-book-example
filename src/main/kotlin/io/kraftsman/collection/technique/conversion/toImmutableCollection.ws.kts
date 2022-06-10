package io.kraftsman.collection.technique.conversion

/**
 * toList() - 轉換成 List
 * toSet() - 轉換成 Set
 * toMap() - 轉換成 Map
 */

// 建立範例資料
val setOfNumbers = setOf(1, 2, 3, 4, 5)
val listOfNumbers = listOf(1, 1, 2, 3, 3, 4, 5)
val listOfPairs = listOf(
    Pair(1, "Grape"),
    Pair(2, "Papaya"),
    Pair(3, "Pineapple")
)

// 示範使用方式
setOfNumbers.toList()
listOfNumbers.toSet()
listOfPairs.toMap()
