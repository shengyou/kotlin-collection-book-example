package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapIndexedNotNull() - 將集合轉換為其他元素組成的集合時包含索引，並去除 Null 的結果
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
customers.mapIndexedNotNull { index, customer ->
    if (customer.name.length > 4) {
        "$index: ${customer.name}"
    } else {
        null
    }
}
