package io.kraftsman.collection.technique.grouping

/**
 * filterValues() - 依照件過濾 Map 的 Value
 */

// 建立範例資料
val languages = mapOf(
    "Kotlin" to 2011,
    "Java" to 1995,
    "C++" to 1980,
)

// 測試 APIs
languages.filterValues { it <= 2000 }
