package io.kraftsman.collection.technique.aggregation

/**
 * reduceTo() - 將分群後將每一組子集合做累進運算後寫入指定集合
 */

// 建立範例資料
val numberStrings = listOf("one", "two", "three", "four", "five", "six")
val longestWordInGroup = mutableMapOf<Char, String>()

// 測試 APIs
numberStrings.groupingBy { it.first() }
    .reduceTo(longestWordInGroup) { _, accumulator, element ->
        maxOf(accumulator, element, compareBy { it.length })
    }
