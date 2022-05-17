package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapValuesTo() - 重新對映 Map Value 後附加至指定集合
 */

// 建立範例資料
val customers = mapOf(
    1 to Customer("Sue", 23),
    2 to Customer("Mary", 27),
    3 to Customer("Peter", 37),
)
val customerNames = mutableMapOf<Int, String>()

// 測試 APIs
customers.mapValuesTo(customerNames) { (_, customer) ->
    customer.name
}
