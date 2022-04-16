package io.kraftsman.collection.technique.grouping

import io.kraftsman.collection.data.Employee

/**
 * distinctBy() - 依照條件過濾重覆資料
 */

// 建立範例資料
val chars = listOf('A', 'a', 'b', 'B', 'A', 'a')
var fruits = listOf("apple", "banana", "mango", "berry")
val employees = listOf(
    Employee(1, "Tom", "Backend"),
    Employee(2, "John", "IT"),
    Employee(3, "Simon", "Backend"),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design"),
)

// 測試 APIs
chars.distinctBy { it.uppercaseChar() }
fruits.distinctBy { it[0] }
employees.distinctBy { it.department }
