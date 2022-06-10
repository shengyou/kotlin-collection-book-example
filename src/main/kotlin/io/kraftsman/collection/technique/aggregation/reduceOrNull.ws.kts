package io.kraftsman.collection.technique.aggregation

/**
 * reduceOrNull() - 由左至右累進，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val emptyListOfNumbers = emptyList<Int>()
val listOfNothing = listOf<Int>()

// 示範使用方式
numbers.reduceOrNull { accumulator, element ->
    accumulator + element
}

emptyListOfNumbers.reduceOrNull { accumulator, element ->
    accumulator + element
}

listOfNothing.reduceOrNull { accumulator, element ->
    accumulator + element
}
