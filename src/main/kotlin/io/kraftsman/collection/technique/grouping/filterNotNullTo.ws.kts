package io.kraftsman.collection.technique.grouping

/**
 * filterNotNullTo() - 過濾出非 Null 值後附加至指定集合
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
val shoppingList = mutableListOf("Apple")
val emptyList = mutableListOf<String>()

// 測試 APIs
fruits.filterNotNullTo(shoppingList)

fruits.filterNotNullTo(emptyList)

val returnList = fruits.filterNotNullTo(mutableListOf())