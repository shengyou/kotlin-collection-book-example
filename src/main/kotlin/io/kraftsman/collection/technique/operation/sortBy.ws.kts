package io.kraftsman.collection.technique.operation

/**
 * sortBy() - 以傳入的 λ 正向排序
 */

// 建立範例資料
val fruits = mutableListOf("Grape", "Muskmelon", "Kumquat", "Pear")

// 測試 APIs
fruits.sortBy { it.length }
println(fruits)
