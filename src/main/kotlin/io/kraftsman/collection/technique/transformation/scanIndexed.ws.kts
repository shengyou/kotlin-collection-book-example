package io.kraftsman.collection.technique.transformation

/**
 * scanIndexed() - 依初始值及 λ 邏輯累進（有 Index）
 */

// 建立範例資料
val strings = listOf("a", "b", "c", "d")

// 測試 APIs
strings.scanIndexed("s") { index, accumulator, string -> accumulator + string + index }
