package io.kraftsman.collection.technique.conversion

/**
 * toSortedMap() - 依 Natural Ordering 排序後轉成 SortedMap
 */

// 建立範例資料
val languagesByYear = mapOf(
    "PHP" to 1995,
    "Kotlin" to 2011,
    "Java" to 1995,
    "C++" to 1980,
    "Ruby" to 1995,
)
val yearByLanguage = mapOf(
    1995 to "PHP",
    2011 to "Kotlin",
    1995 to "Java",
    1980 to "C++",
    1995 to "Ruby",
)

// 測試 APIs
languagesByYear.toSortedMap()
yearByLanguage.toSortedMap()
