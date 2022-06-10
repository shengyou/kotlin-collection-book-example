package io.kraftsman.collection.technique.aggregation

/**
 * foldRight() - 依給定的初始值由右向左累進
 */

// 建立範例資料
val numbers = listOf(5, 2, 10, 4)

// 示範使用方式
numbers.foldRight(100) { accumulator, element ->
    accumulator - element
}
