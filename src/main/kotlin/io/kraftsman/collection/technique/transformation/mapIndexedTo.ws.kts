package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapIndexedTo() - 將 Map 轉換為其他元素（有 Index）後寫入指定 Collection
 */

// 建立範例資料
val customers = listOf(
    Customer("Sue", 23),
    Customer("Mary", 27),
    Customer("Peter", 37),
    Customer("Amos", 32),
    Customer("Craig", 45),
)
val customerWithIndex = mutableListOf<String>()

// 測試 APIs
customers.mapIndexedTo(customerWithIndex) { index, customer ->
    "$index: ${customer.name}"
}
