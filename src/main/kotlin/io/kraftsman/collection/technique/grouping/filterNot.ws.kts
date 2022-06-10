package io.kraftsman.collection.technique.grouping

/**
 * filterNot() - 依條件反向過濾
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")

// 示範使用方式
fruits.filterNot { it.startsWith('P') }
