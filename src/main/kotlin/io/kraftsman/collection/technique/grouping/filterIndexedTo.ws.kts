package io.kraftsman.collection.technique.grouping

/**
 * filterIndexedTo() - 在過濾集合時包含索引，並附加至指定集合
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val shoppingList = mutableListOf("Apple")
val emptyList = mutableListOf<String>()

// 示範使用方式
fruits.filterIndexedTo(shoppingList) { index, element ->
    (index != 0) && (element.length < 5)
}

fruits.filterIndexedTo(emptyList) { index, element ->
    (index != 0) && (element.length < 5)
}

val returnList = fruits.filterIndexedTo(mutableListOf()) { index, element ->
    (index != 0) && (element.length < 5)
}
