package io.kraftsman.collection.technique.transformation

/**
 * union() - 兩個 Collection 找聯集
 */

// 建立範例資料
val left = listOf(1, 2, 3)
val right = listOf(2, 3, 4)
val leftWithDuplicates = listOf(1, 1, 2, 2, 2, 3)
val leftRandomOrder = listOf(3, 1, 2)
val rightRandomOrder = listOf(5, 3, 4)

// 測試 APIs
left.union(right)
left union right

leftWithDuplicates.union(right)
leftRandomOrder.union(rightRandomOrder)