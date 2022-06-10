package io.kraftsman.collection.technique.transformation

/**
 * scan() - 依初始值及 λ 邏輯累進
 */

// 建立範例資料
val letters = listOf("a", "b", "c", "d")

// 示範使用方式
letters.scan("→") { accumulator, letter ->
    accumulator + letter
}
