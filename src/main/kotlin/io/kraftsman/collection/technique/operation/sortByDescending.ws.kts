package io.kraftsman.collection.technique.operation

/**
 * sortByDescending() - 依傳入的 λ 反向排序
 */

// 建立範例資料
val fruits = mutableListOf("Grape", "Muskmelon", "Kumquat", "Pear")

// 示範使用方式
fruits.sortByDescending { it.length }
println(fruits)
