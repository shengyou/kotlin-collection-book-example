package io.kraftsman.collection.technique.aggregation

/**
 * reduce() - 由左至右累進，若是 Empty 集合則拋出 UnsupportedOperationException
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val strings = listOf("a", "b", "c", "d", "e")

// 示範使用方式
numbers.reduce { accumulator, element ->
    accumulator + element
}
numbers.sum()

strings.reduce { accumulator, element ->
    "$accumulator, $element"
}
strings.joinToString()
