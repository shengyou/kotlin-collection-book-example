package io.kraftsman.collection.technique.aggregation

/**
 * reduceRightOrNull() - 由右至左累進，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val emptyListOfNumbers = emptyList<Int>()
val listOfNothing = listOf<Int>()

// 示範使用方式
numbers.reduceRightOrNull { accumulator, element ->
    accumulator - element
}

emptyListOfNumbers.reduceRightOrNull { element, accumulator ->
    accumulator - element
}

listOfNothing.reduceRightOrNull { element, accumulator ->
    accumulator - element
}
