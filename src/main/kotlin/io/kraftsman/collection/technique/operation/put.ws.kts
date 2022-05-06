package io.kraftsman.collection.technique.operation

/**
 * put() - 將元素新增至 Map
 */

// 建立範例資料
val names = mutableMapOf(
    1 to "John",
    2 to "Tom",
    3 to "Mary",
)

// 測試 APIs
names.put(3, "Simon")
println(names)

names.put(4, "Craig")
println(names)

names[5] = "Rita"
println(names)
