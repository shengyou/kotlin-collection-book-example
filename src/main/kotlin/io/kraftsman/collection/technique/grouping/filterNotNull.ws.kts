package io.kraftsman.collection.technique.grouping

/**
 * filterNotNull() - 過濾非 Null 值
 */

// 建立範例資料
val fruits = listOf(
    "Grape",
    null,
    "Muskmelon",
    null,
    "Kumquat",
    "Pear"
)

// 示範使用方式
fruits.filterNotNull()

fruits.filter { it != null }
