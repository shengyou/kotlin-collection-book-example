package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Employee

/**
 * flatMap() - 把集合元素轉換後再打平階層
 */

// 建立範例資料
val employees = listOf(
    Employee(1, "Tom", "Backend", listOf("DB", "API")),
    Employee(2, "John", "IT", listOf("Network", "Hardware")),
    Employee(3, "Simon", "Backend", listOf("MVC", "API", "GraphQL")),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design", listOf("Graphic")),
)

// 測試 APIs
employees.flatMap { it.skills ?: listOf() }

employees.mapNotNull { it.skills }
    .flatten()
