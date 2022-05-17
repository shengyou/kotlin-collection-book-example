package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapKeysTo() - 重新對映 Map Key 後附加至指定集合
 */

// 建立範例資料
val customers = mapOf(
    1 to Customer("Sue", 23),
    2 to Customer("Mary", 27),
    3 to Customer("Peter", 37),
)
val customerNames = mutableMapOf<String, Customer>()

// 測試 APIs
customers.mapKeysTo(customerNames) { (_, customer) ->
    customer.name
}
