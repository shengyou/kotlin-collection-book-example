package io.kraftsman.collection.technique.aggregation

/**
 * fold() - 依給定的初始值由左向右累進
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val strings = listOf("a", "b", "c", "d", "e")

// 示範使用方式
numbers.fold(100) { accumulator, element ->
    accumulator + element
}

strings.fold("x") { accumulator, element ->
    "$accumulator, $element"
}
