package io.kraftsman.collection.technique.grouping

/**
 * groupByTo() - 依條件分群後寫入指定集合
 */

// 建立範例資料
val phoneToYear = listOf(
    "Nexus One" to 2010,
    "Pixel 2" to 2017,
    "Pixel 4a" to 2020,
    "iPhone 4" to 2010,
    "iPhone X" to 2017,
    "Galaxy Note 8" to 2017,
    "Galaxy S11" to 2020
)
val phonesByYear = mutableMapOf<Int, MutableList<String>>()

// 測試 APIs
phoneToYear.groupByTo(
    phonesByYear,
    { it.second },
    { it.first }
)

phonesByYear[2020] = mutableListOf("iPhone 12")
