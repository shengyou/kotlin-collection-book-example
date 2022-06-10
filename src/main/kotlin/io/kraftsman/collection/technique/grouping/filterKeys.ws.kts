package io.kraftsman.collection.technique.grouping

/**
 * filterKeys() - 依條件過濾 Map 的 Key
 */

// 建立範例資料
val languages = mapOf(
    "Kotlin" to 2011,
    "Java" to 1995,
    "C++" to 1980,
)

// 示範使用方式
languages.filterKeys { it != "C++" }
