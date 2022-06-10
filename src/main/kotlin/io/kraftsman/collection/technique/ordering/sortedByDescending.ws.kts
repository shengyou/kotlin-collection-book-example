package io.kraftsman.collection.technique.ordering

/**
 * sortedByDescending() - 依傳入的 λ 反向排序
 */

// 建立範例資料
val fruits = listOf("Grape", "Muskmelon", "Kumquat", "Pear")

// 示範使用方式
fruits.sortedByDescending { it.length }
fruits.sortedByDescending { it.last() }
