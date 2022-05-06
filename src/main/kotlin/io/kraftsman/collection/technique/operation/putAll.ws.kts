package io.kraftsman.collection.technique.operation

/**
 * putAll() - 新增多個元素進 Map
 */

// 建立範例資料
val names = mutableMapOf(
    1 to "John",
    2 to "Tom",
    3 to "Mary",
)

// 測試 APIs
names.putAll(
    mapOf(
        3 to "Simon",
        4 to "Bruce",
    )
)
println(names)
