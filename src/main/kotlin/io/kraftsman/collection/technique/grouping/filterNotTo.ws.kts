package io.kraftsman.collection.technique.grouping

/**
 * filterNotTo() - 依條件反向過濾後附加至指定集合
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val shoppingList = mutableListOf("Apple")
val emptyList = mutableListOf<String>()

// 示範使用方式
fruits.filterNotTo(emptyList) {
    it.startsWith('P')
}

fruits.filterNotTo(shoppingList) {
    it.startsWith('P')
}

val returnList = fruits.filterNotTo(mutableListOf()) {
    it.startsWith('P')
}
