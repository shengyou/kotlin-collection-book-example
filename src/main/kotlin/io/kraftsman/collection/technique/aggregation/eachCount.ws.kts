package io.kraftsman.collection.technique.aggregation

/**
 * eachCount() - 計算分群後每一組子集合裡的數量
 */

// 建立範例資料
val fruits = listOf(
    "Cherry",
    "Blueberry",
    "Citrus",
    "Apple",
    "Apricot",
    "Banana",
    "Coconut"
)

// 示範使用方式
fruits.groupingBy { it.first() }
    .eachCount()

fruits.groupingBy { it.first() }
    .eachCount()
    .toList()
    .sortedByDescending { it.second }
