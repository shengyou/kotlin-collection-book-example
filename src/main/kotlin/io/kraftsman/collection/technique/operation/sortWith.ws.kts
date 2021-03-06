package io.kraftsman.collection.technique.operation

/**
 * sortWith() - 依傳入的 Comparator 排序
 */

// 建立範例資料
val target = mutableListOf("aaa", "bb", "c")
val lengthComparator = Comparator { str1: String, str2: String ->
    str1.length - str2.length
}

// 示範使用方式
target.sortWith(lengthComparator)
println(target)

target.sortWith(compareBy { it.length })
println(target)

target.sortWith(compareByDescending { it.length })
println(target)
