package io.kraftsman.collection.technique.aggregation

/**
 * foldIndexed() - 依給定的初始值由左向右累進，包含索引
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val strings = listOf("a", "b", "c", "d", "e")

// 測試 APIs
numbers.foldIndexed(100) { index, accumulator, element ->
    accumulator + (index * element)
}

strings.foldIndexed("x") { index, accumulator, element ->
    "$accumulator, $index: $element"
}
