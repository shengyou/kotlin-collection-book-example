package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapIndexedNotNullTo() - 將集合轉換成其他元素時可取得索引，並在去除 Null 的結果後寫入指定集合
 */

// 建立範例資料
val customers = listOf(
    Customer("Sue", 23),
    Customer("Mary", 27),
    Customer("Peter", 37),
    Customer("Amos", 32),
    Customer("Craig", 45),
)
val customerNames = mutableListOf<String>()

// 測試 APIs
customers.mapIndexedNotNullTo(customerNames) { index, customer ->
    if (customer.name.length > 4) {
        "$index: ${customer.name}"
    } else {
        null
    }
}
