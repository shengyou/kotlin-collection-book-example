package io.kraftsman.collection.technique.operation

/**
 * sortByDescending() - 依傳入的 λ 反向排序
 */

// 建立範例資料
val fruits = mutableListOf("Grape", "Muskmelon", "Kumquat", "Pear")

// 測試 APIs
fruits.sortByDescending { it.length }
println(fruits)
