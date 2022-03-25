package io.kraftsman.collection.technique.aggregation

/**
 * reduceRight() - 由右至左累進，若空集合則拋出 UnsupportedOperationException
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)

// 測試 APIs
numbers.reduceRight { acc, i -> acc - i }
numbers.reduce { acc, i -> acc - i }
