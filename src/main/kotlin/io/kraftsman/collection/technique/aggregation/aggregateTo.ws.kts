package io.kraftsman.collection.technique.aggregation

/**
 * aggregateTo() - 將分群後的每一組子集合做客製化運算後附加至指定集合
 */

// 建立範例資料
val numbers = listOf(3, 4, 5, 6, 7, 8, 9)
val mutableMap = mutableMapOf<Int, String>()

// 測試 APIs
numbers.groupingBy { it % 3 }
    .aggregateTo(mutableMap) { _, accumulator: String?, element, first ->
        if (first)
            "$element"
        else
            "${accumulator!!},$element"
    }
