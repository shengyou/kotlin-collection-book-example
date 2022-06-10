package io.kraftsman.collection.technique.operation

/**
 * minus() - 將元素與指定集合相減
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")

// 示範使用方式
names.minus("Tom")
names.minus(listOf("Tom", "John"))

names - "Mary"
