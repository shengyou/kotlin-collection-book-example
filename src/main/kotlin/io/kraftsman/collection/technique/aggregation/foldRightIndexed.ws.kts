package io.kraftsman.collection.technique.aggregation

/**
 * foldRightIndexed() - 依給定的初始值由右向左累進，包含索引
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)

// 示範使用方式
numbers.foldRightIndexed(100) { index, element, accumulator ->
    accumulator + (index * element)
}
