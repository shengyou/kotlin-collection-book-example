package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Address

/**
 * getOrPut() - 依 Key 取出 Map 裡的元素，若不存在則依邏輯寫入
 */

// 建立範例資料
val orders = mutableMapOf(
    "Sue" to Address("Taipei", "116"),
    "Mary" to Address("Keelong", "202"),
    "Peter" to Address("Taoyuan", "326"),
    "Amos" to Address("Taichung", "423"),
    "Craig" to Address("Tainan", "703"),
)

// 測試 APIs
orders.getOrPut("Sue") { Address("Taitung", "950") }
orders.getOrPut("Simon") { Address("Taitung", "950") }
