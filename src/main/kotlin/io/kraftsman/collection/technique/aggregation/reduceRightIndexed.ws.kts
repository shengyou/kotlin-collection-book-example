package io.kraftsman.collection.technique.aggregation

/**
 * reduceRightIndexed() - 由右至左累進（有 Index），若空集合則拋出 UnsupportedOperationException
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)

// 測試 APIs
numbers.reduceRightIndexed { index, i, acc -> acc + (index * i) }
numbers.reduceIndexed { index, acc, i -> acc + (index * i) }

