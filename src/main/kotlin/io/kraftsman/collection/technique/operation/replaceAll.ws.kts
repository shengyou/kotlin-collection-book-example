package io.kraftsman.collection.technique.operation

/**
 * replaceAll() - 將集合所有元素都套用 λ 後取代
 */

// 建立範例資料
val numbers = mutableListOf(1, 3, 5, 7, 9)

// 示範使用方式
numbers.replaceAll { it * 2 }
println(numbers)
