package io.kraftsman.collection.technique.aggregation

/**
 * foldTo() - 將分群後將每一組子集合依初始值做累進運算後寫入指定集合
 */

// 建立範例資料
val fruits = listOf(
    "cherry",
    "blueberry",
    "citrus",
    "apple",
    "apricot",
    "banana",
    "coconut"
)

// 測試 APIs
fruits.groupingBy { it.first() }
    .foldTo(
        mutableMapOf(),
        { key, _: String ->
            key to mutableListOf<String>()
        },
        { _, accumulator, element ->
            if (element.length % 2 == 0) accumulator.second.add(element)
            accumulator
        }
    )
