package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapNotNullTo() - 將 Map 轉換成其他元素並去除 Null 的結果後寫入指定 Collection
 */

// 建立範例資料
val customers = listOf(
    Customer("Sue", 23),
    Customer("Mary", 27),
    Customer("Peter", 37),
    Customer("Amos", 32),
    Customer("Craig", 45),
)
val customerNames = mutableListOf("Tom")

// 測試 APIs
customers.mapNotNullTo(customerNames) {
    if (it.name.length > 3) {
        it.name
    } else {
        null
    }
}
