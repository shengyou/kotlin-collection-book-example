package io.kraftsman.collection.technique.conversion

/**
 * toPair() - 將 Map.Entry 轉成 Pair
 */

// 建立範例資料
val mapOfWarehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

// 示範使用方式
mapOfWarehouse.entries.map {
    it.toPair()
}

mapOfWarehouse.toList()
