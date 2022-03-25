package io.kraftsman.collection.technique.aggregation

/**
 * aggregate() - 將 Grouping 後每一組子 Collection 做客製化運算
 */

// 建立範例資料
val numbers = listOf(3, 4, 5, 6, 7, 8, 9)

// 測試 APIs
numbers.groupingBy { it % 3 }.aggregate { _, accumulator: String?, element, first ->
    if (first)
        "$element"
    else
        "${accumulator!!},$element"
}
