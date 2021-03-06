package io.kraftsman.collection.technique.grouping

import io.kraftsman.collection.data.Employee

/**
 * groupBy() - 依條件分群
 */

// 建立範例資料
val fruits = listOf(
    "cOcoNut",
    "PaPaYa",
    "CRanBerry",
    "pINEApple",
    "BaNaNa",
    "PeaR"
)
val employees = listOf(
    Employee(1, "Tom", "Backend"),
    Employee(2, "John", "IT"),
    Employee(3, "Simon", "Backend"),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design"),
)

// 示範使用方式
fruits.groupBy { it.first() }
fruits.groupBy(
    { it.first().uppercaseChar() },
    { it.lowercase().replaceFirstChar(Char::uppercaseChar) }
)

employees.groupBy(
    { it.department },
    {it.name}
)
