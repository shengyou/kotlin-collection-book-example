package io.kraftsman.collection.technique.transformation

/**
 * scanIndexed() - 依初始值及 λ 累進時可取得索引
 */

// 建立範例資料
val letters = listOf("a", "b", "c", "d")

// 測試 APIs
letters.scanIndexed("→") { index, accumulator, letter ->
    "$accumulator $index: $letter"
}
