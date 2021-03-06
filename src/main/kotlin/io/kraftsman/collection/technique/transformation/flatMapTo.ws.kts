package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Employee

/**
 * flatMapTo() - 轉換集合元素並攤平階層後附加至指定集合
 */

// 建立範例資料
val employees = listOf(
    Employee(1, "Tom", "Backend", listOf("DB", "API")),
    Employee(3, "Simon", "Backend", listOf("MVC", "API", "GraphQL")),
    Employee(5, "Tracy", "Design", listOf("Graphic")),
)
val employeeSkills = mutableListOf("Accounting")

// 示範使用方式
employees.flatMapTo(employeeSkills) { it.skills ?: listOf() }
