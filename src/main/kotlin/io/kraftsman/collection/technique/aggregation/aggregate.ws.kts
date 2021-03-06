package io.kraftsman.collection.technique.aggregation

/**
 * aggregate() - 將分群後每一組子集合做客製化運算
 */

// 建立範例資料
val numbers = listOf(3, 4, 5, 6, 7, 8, 9)

// 示範使用方式
numbers.groupingBy { it % 3 }
    .aggregate { _, accumulator: String?, element, first ->
        if (first)
            "$element"
        else
            "${accumulator!!},$element"
    }
