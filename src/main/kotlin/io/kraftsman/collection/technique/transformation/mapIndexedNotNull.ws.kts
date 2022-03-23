package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapIndexedNotNull() - 將 Map 轉換成其他元素並去除 Null 的結果（有 Index）
 */

// 建立範例資料
val customers = listOf(
    Customer("Sue", 23),
    Customer("Mary", 27),
    Customer("Peter", 37),
    Customer("Amos", 32),
    Customer("Craig", 45),
)

// 測試 APIs
customers.mapIndexedNotNull { index, customer ->
    if (customer.name.length > 3) {
        "$index: ${customer.name}"
    } else {
        null
    }
}
