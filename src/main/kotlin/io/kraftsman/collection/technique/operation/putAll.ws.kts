package io.kraftsman.collection.technique.operation

/**
 * putAll() - 將數個元素放入 Map 裡的指定位置
 */

// 建立範例資料
val names = mutableMapOf(
    1 to "John",
    2 to "Tom",
    3 to "Mary",
)

// 測試 APIs
names.putAll(mapOf(
    4 to "Simon",
    5 to "Bruce",
))
