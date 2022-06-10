package io.kraftsman.collection.technique.aggregation

/**
 * foldTo() - 依初始值將分群後的每一組子集合做累進運算後附加至指定集合
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

// 示範使用方式
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
