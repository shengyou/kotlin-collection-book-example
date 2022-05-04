package io.kraftsman.collection.technique.transformation

/**
 * flatten() - 打平集合階層
 */

// 建立範例資料
val numberSets = listOf(
    setOf(1, 2, 3),
    setOf(4, 5, 6),
    setOf(1, 2),
)

// 測試 APIs
numberSets.flatten()
