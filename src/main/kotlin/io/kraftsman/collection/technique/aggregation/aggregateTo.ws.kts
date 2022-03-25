package io.kraftsman.collection.technique.aggregation

/**
 * aggregateTo() - 將 Grouping 後每一組子 Collection 做客製化運算後寫入指定 Collection
 */

// 建立範例資料
val numbers = listOf(3, 4, 5, 6, 7, 8, 9)
val mutableMap = mutableMapOf<Int, String>()

// 測試 APIs
numbers.groupingBy { it % 3 }.aggregateTo(mutableMap) { _, accumulator: String?, element, first ->
    if (first)
        "$element"
    else
        "${accumulator!!},$element"
}
