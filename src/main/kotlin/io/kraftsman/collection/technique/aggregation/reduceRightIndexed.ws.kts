package io.kraftsman.collection.technique.aggregation

/**
 * reduceRightIndexed() - 由右至左累進時可取得索引，若是 Empty 集合則拋出 UnsupportedOperationException
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)

// 測試 APIs
numbers.reduceRightIndexed { index, element, accumulator ->
    accumulator + (index * element)
}
