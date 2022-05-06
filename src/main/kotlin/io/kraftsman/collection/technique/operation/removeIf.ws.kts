package io.kraftsman.collection.technique.operation

/**
 * removeIf() - 依條件移除元素
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")
val nameList = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
names.removeIf { it.contains('o') }
println(names)

nameList.removeAll { it.contains('o') }
println(nameList)
