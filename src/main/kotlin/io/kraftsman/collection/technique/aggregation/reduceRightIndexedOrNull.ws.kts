package io.kraftsman.collection.technique.aggregation

/**
 * reduceRightIndexedOrNull() - 由右至左累進時可取得索引，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)
val emptyListOfNumbers = emptyList<Int>()
val listOfNothing = listOf<Int>()

// 測試 APIs
numbers.reduceRightIndexedOrNull { index, element, accumulator ->
    accumulator + (index * element)
}

emptyListOfNumbers.reduceRightIndexedOrNull { index, element, accumulator ->
    accumulator + (index * element)
}

listOfNothing.reduceRightIndexedOrNull { index, element, accumulator ->
    accumulator + (index * element)
}
