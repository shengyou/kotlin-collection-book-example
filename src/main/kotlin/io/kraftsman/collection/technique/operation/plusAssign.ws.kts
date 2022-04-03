package io.kraftsman.collection.technique.operation

/**
 * plusAssign() - 將元素加入 Collection 裡
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
names += "Simon"
names.plusAssign("Simon")
names.add("Simon")
