package io.kraftsman.collection.technique.operation

/**
 * minus() - 將元素與指定 Collection 相減後回傳
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
names - "Tom"
names.minus("Tom")
names.minus(listOf("Tom", "John"))
