package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Address
import io.kraftsman.collection.data.Customer

/**
 * mapTo() - 將 Map 轉換為其他元素後寫入指定 Collection
 */

// 建立範例資料
val orders = mapOf(
    Customer("Sue", 23) to Address("Taipei", "116"),
    Customer("Mary", 27) to Address("Keelong", "202"),
    Customer("Peter", 37) to Address("Taoyuan", "326"),
    Customer("Amos", 32) to Address("Taichung", "423"),
    Customer("Craig", 45) to Address("Tainan", "703"),
)
val addressBar = mutableListOf<String>()

// 測試 APIs
orders.mapTo(addressBar) { (customer, address) ->
    "${address.postcode} ${address.city} ${customer.name}"
}
