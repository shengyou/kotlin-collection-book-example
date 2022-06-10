package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapNotNull() - 將集合轉換成其他元素組成的集合，並去除 Null 的結果
 */

// 建立範例資料
val customers = listOf(
    Customer("Sue", 23),
    Customer("Mary", 27),
    Customer("Peter", 37),
    Customer("Amos", 32),
    Customer("Craig", 45),
)

// 示範使用方式
customers.mapNotNull {
    if (it.name.length > 4) {
        it.name
    } else {
        null
    }
}
