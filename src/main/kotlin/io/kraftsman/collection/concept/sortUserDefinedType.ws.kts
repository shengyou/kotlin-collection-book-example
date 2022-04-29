package io.kraftsman.collection.concept

import io.kraftsman.collection.data.Version

/**
 * 為自行定義的類別做 Natual Order
 */

// 建立範例資料
val versions = listOf(
    Version(2, 1, 1),
    Version(1, 1, 1),
    Version(1, 0, 1),
    Version(1, 2, 0),
)

// 測試 APIs
versions.sorted()
versions.sortedDescending()
