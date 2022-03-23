package io.kraftsman.collection.technique.transformation

/**
 * scan() - 依初始值及 λ 邏輯累進
 */

// 建立範例資料
val strings = listOf("a", "b", "c", "d")

// 測試 APIs
strings.scan("s") { accumulator, string -> accumulator + string }
