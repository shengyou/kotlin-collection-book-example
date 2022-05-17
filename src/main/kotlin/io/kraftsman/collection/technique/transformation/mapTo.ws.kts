package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Address
import io.kraftsman.collection.data.Customer

/**
 * mapTo() - 將集合轉換為其他元素後附加至指定集合
 */

// 建立範例資料
val orders = mapOf(
    Customer("Sue", 23) to Address("Taipei", "116"),
    Customer("Mary", 27) to Address("Keelung", "202"),
    Customer("Peter", 37) to Address("Taoyuan", "326")
)
val addressBar = mutableListOf("703 Tainan Craig")

// 測試 APIs
orders.mapTo(addressBar) { (customer, address) ->
    "${address.postcode} ${address.city} ${customer.name}"
}

addressBar.add("423 Taichung Amos")
