package io.kraftsman.collection.technique.transformation

/**
 * unzip() - 把集合裡的配對以 Key 及 Value 拆成獨立集合
 */

// 建立範例資料
val warehouse = listOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

// 示範使用方式
val (fruits, amounts) = warehouse.unzip()
