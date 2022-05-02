package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Address

/**
 * getOrDefault() - 依 Key 取出 Map 元素，若超出範圍則回傳預設值
 */

// 建立範例資料
val orders = mapOf(
    "Sue" to Address("Taipei", "116"),
    "Mary" to Address("Keelong", "202"),
    "Peter" to Address("Taoyuan", "326"),
    "Amos" to Address("Taichung", "423"),
    "Craig" to Address("Tainan", "703"),
)

// 測試 APIs
orders.getOrDefault("Sue", Address("Taitung", "950"))
orders.getOrDefault("Simon", Address("Taitung", "950"))
