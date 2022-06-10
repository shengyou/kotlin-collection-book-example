package io.kraftsman.collection.technique.checking

/**
 * isNullOrEmpty() - 檢查集合是否為 Null 或是不包含元素
 */

// 建立範例資料
var numbers: List<Int>? = null

// 示範使用方式
numbers.isNullOrEmpty()
numbers = listOf(1,2,3)
numbers.isNullOrEmpty()
