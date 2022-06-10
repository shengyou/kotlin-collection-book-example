package io.kraftsman.collection.technique.transformation

/**
 * union() - 在兩個集合間找聯集
 */

// 建立範例資料
val left = listOf(1, 2, 3)
val right = listOf(2, 3, 4)
val leftRandomOrder = listOf(3, 1, 2)
val rightRandomOrder = listOf(5, 3, 4)
val leftWithDuplicates = listOf(1, 1, 2, 2, 2, 3)

// 示範使用方式
left.union(right)

leftRandomOrder.union(rightRandomOrder)

leftWithDuplicates.union(right)

left.union(right)
left union right
