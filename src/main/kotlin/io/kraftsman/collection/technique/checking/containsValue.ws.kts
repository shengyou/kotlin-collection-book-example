package io.kraftsman.collection.technique.checking

/**
 * containsValue() - 檢查 Map 裡的是否包含特定 Value？
 */

// 建立範例資料
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

// 測試 APIs
warehouse.containsValue(10)
warehouse.containsValue(200)
