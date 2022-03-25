package io.kraftsman.collection.technique.aggregation

/**
 * reduceTo() - 將 Grouping 後每一組子 Collection 做累進運算後寫入指定 Collection
 */

// 建立範例資料
val numberStrings = listOf("one", "two", "three", "four", "five", "six")
val longestWordInGroup = mutableMapOf<Char, String>()

// 測試 APIs
numberStrings.groupingBy { it.first() }.reduceTo(longestWordInGroup) { _, accumulator, element ->
    maxOf(accumulator, element, compareBy { it.length})
}
