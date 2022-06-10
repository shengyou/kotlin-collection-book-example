package io.kraftsman.collection.technique.operation

/**
 * sortBy() - 依傳入的 λ 正向排序
 */

// 建立範例資料
val fruits = mutableListOf("Grape", "Muskmelon", "Kumquat", "Pear")

// 示範使用方式
fruits.sortBy { it.length }
println(fruits)
