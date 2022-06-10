package io.kraftsman.collection.technique.aggregation

/**
 * reduceTo() - 將分群後的每一組子集合做累進運算後附加至指定集合
 */

// 建立範例資料
val numberStrings = listOf("one", "two", "three", "four", "five", "six")
val longestWordInGroup = mutableMapOf<Char, String>()

// 示範使用方式
numberStrings.groupingBy { it.first() }
    .reduceTo(longestWordInGroup) { _, accumulator, element ->
        maxOf(accumulator, element, compareBy { it.length })
    }
