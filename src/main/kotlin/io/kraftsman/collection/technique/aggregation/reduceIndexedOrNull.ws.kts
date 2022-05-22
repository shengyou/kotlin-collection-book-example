package io.kraftsman.collection.technique.aggregation

/**
 * reduceIndexedOrNull() - 由左至右累進，包含索引，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val emptyListOfNumbers = emptyList<Int>()
val listOfNothing = listOf<Int>()

// 測試 APIs
numbers.reduceIndexedOrNull { index, accumulator, element ->
    accumulator + (index * element)
}

emptyListOfNumbers.reduceIndexedOrNull { index, accumulator, element ->
    accumulator + (index * element)
}

listOfNothing.reduceIndexedOrNull { index, accumulator, element ->
    accumulator + (index * element)
}
