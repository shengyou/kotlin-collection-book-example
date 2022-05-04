package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Customer

/**
 * mapKeys() - 重新對映 Map Key
 */

// 建立範例資料
val customers = mapOf(
    1 to Customer("Sue", 23),
    2 to Customer("Mary", 27),
    3 to Customer("Peter", 37),
)

// 測試 APIs
customers.mapKeys { it.value.name }

customers.mapKeys { (_, customer) ->
    customer.name
}
