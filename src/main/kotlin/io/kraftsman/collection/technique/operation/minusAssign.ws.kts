package io.kraftsman.collection.technique.operation

/**
 * minusAssign() - 將元素從 Collection 移除
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
names.minusAssign("Tom")
println(names)

names -= "John"
println(names)

names.remove("Mary")
println(names)
