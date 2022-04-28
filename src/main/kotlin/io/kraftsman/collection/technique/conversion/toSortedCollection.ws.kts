package io.kraftsman.collection.technique.conversion

/**
 * 轉型成 Sorted 集合
 *
 * toSortedMap()
 * toSortedSet()
 */

// 建立範例資料
val listOfNumbers = listOf(10, 10, 3, 3, 2, 2, 2, 4, 7, 5)

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
listOfNumbers.toSortedSet()

languagesByYear.toSortedMap()
yearByLanguage.toSortedMap()
