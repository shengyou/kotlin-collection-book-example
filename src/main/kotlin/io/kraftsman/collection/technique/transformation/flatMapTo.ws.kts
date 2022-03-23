package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Employee

/**
 * flatMapTo() - 把元素轉換後打平階層後寫入指定 Collection
 */

// 建立範例資料
val employees = listOf(
    Employee(1, "Tom", "Backend", listOf("DB", "API")),
    Employee(3, "Simon", "Backend", listOf("MVC", "API", "GraphQL")),
    Employee(5, "Tracy", "Design", listOf("Graphic")),
)
val employeeSkills = mutableListOf("Accounting")

// 測試 APIs
employees.flatMapTo(employeeSkills) { it.skills ?: listOf() }