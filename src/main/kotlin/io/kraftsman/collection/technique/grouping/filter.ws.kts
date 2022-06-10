package io.kraftsman.collection.technique.grouping

/**
 * filter() - 依條件過濾元素
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

// 示範使用方式
fruits.filter { it.startsWith('P') }

warehouse.filter {
    it.key.contains("n") && it.value >= 10
}

warehouse.filter { (key, value) ->
    key.contains("n") && value >= 10
}
