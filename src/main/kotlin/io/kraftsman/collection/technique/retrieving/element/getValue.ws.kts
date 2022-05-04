package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Address

/**
 * getValue() - 依 Key 取出 Map 裡的元素
 */

// 建立範例資料
val orders = mapOf(
    "Sue" to Address("Taipei", "116"),
    "Mary" to Address("Keelung", "202"),
    "Peter" to Address("Taoyuan", "326"),
    "Amos" to Address("Taichung", "423"),
    "Craig" to Address("Tainan", "703"),
)

// 測試 APIs
orders.getValue("Sue")
orders["Sue"]
