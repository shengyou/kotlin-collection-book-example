package io.kraftsman.collection.technique.grouping

import io.kraftsman.collection.data.Employee

/**
 * groupBy() - 依指定條件分群
 */

// 建立範例資料
val numberStrings = listOf("oNe", "tWo", "tHRee", "foUR", "fIvE")
val employees = listOf(
    Employee(1, "Tom", "Backend"),
    Employee(2, "John", "IT"),
    Employee(3, "Simon", "Backend"),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design"),
)

// 測試 APIs
numberStrings.groupBy { it.first() }
numberStrings.groupBy(
    { it.first().uppercaseChar() },
    { it.lowercase().replaceFirstChar(Char::uppercaseChar) }
)

employees.groupBy( { it.department }, {it.name} )
