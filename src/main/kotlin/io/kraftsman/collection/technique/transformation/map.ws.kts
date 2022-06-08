package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Address
import io.kraftsman.collection.data.Customer

/**
 * map() - 將集合轉換為其他元素
 */

// 建立範例資料
val orders = mapOf(
    Customer("Sue", 23) to Address("Taipei", "116"),
    Customer("Mary", 27) to Address("Keelung", "202"),
    Customer("Peter", 37) to Address("Taoyuan", "326"),
    Customer("Amos", 32) to Address("Taichung", "423"),
    Customer("Craig", 45) to Address("Tainan", "703"),
)

// 測試 APIs
orders.map { (customer, address) ->
    "${address.postcode} ${address.city} ${customer.name}"
}
