package io.kraftsman.collection.technique.aggregation

/**
 * eachCountTo() - 計算分群後每一組子集合裡的數量並附加至指定集合
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
val statistics = mutableMapOf(
    'D' to 0
)

// 示範使用方式
fruits.groupingBy { it.first() }
    .eachCountTo(statistics)
