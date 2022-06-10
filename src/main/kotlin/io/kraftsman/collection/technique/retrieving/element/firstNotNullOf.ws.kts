package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Employee

/**
 * firstNotNullOf() - 取出經過 λ 轉換後，第一個不是 Null 的元素的值，若轉換後是 Empty 集合則拋 NoSuchElementException
 */

// 建立範例資料
val employees = listOf(
    Employee(1, "Tom", "Backend", listOf("DB", "API")),
    Employee(2, "John", "IT", listOf("Network", "Hardware")),
    Employee(3, "Simon", "Backend"),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design", listOf("Graphic")),
)
val emptyList = emptyList<Employee>()
val nothingInList = listOf<Employee>()

// 示範使用方式
employees.first { it.skills != null }
    .skills
employees.firstOrNull { it.skills != null }
    ?.skills

employees.mapNotNull { it.skills }
    .first()

employees.firstNotNullOf { it.skills }
emptyList.firstNotNullOf { it.skills }
nothingInList.firstNotNullOf { it.skills }
