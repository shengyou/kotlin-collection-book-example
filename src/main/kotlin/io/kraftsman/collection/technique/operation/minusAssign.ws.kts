package io.kraftsman.collection.technique.operation

/**
 * minusAssign() - 將元素從 Collection 移除
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
names -= "Tom"
names.minusAssign("Tom")
names.remove("Tom")
