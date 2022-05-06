package io.kraftsman.collection.technique.operation

/**
 * plusAssign() - 將元素加進集合裡
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
names.plusAssign("Simon")
println(names)

names += "Craig"
println(names)

names.add("Christina")
println(names)
