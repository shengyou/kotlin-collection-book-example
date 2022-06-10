package io.kraftsman.collection.technique.retrieving.parts

/**
 * windowed() - 依指定尺寸及步數移動截取集合元素
 */

// 建立範例資料
val numbers = listOf(1, 2, 3, 4, 5)

// 示範使用方式
numbers.windowed(3)

numbers.windowed(
    size = 3,
    step = 2,
    partialWindows = true
)

numbers.windowed(
    size = 3,
    step = 2,
    partialWindows = false
)

numbers.windowed(size = 3,
    step = 2,
    partialWindows = false
) { it.sum() }
