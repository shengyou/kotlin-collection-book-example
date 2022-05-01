package io.kraftsman.collection.technique.grouping

/**
 * filterTo() - 依條件過濾後附加至指定集合
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val shoppingList = mutableListOf("Apple")
val emptyList = mutableListOf<String>()

// 測試 APIs
fruits.filterTo(shoppingList) {
    it.length > 5
}

shoppingList.add("Banana")

fruits.filterTo(emptyList) {
    it.length > 5
}

val returnList = fruits.filterTo(mutableListOf()) {
    it.length > 5
}
