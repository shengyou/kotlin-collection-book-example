package io.kraftsman.collection.technique.transformation

/**
 * scanIndexed() - 依初始值及 λ 累進時包含索引
 */

// 建立範例資料
val letters = listOf("a", "b", "c", "d")

// 示範使用方式
letters.scanIndexed("→") { index, accumulator, letter ->
    "$accumulator $index: $letter"
}
