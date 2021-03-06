package io.kraftsman.collection.technique.checking

/**
 * containsKey() - 檢查 Map 是否包含特定 Key
 */

// 建立範例資料
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

// 示範使用方式
warehouse.contains("Apple")

warehouse.containsKey("Apple")
warehouse.containsKey("Grapes")
