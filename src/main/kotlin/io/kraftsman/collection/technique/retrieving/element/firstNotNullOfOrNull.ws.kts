package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Employee

/**
 * firstNotNullOfOrNull() - 取出經過 λ 轉換後第一個不是 Null 的元素，若轉換後都是 Null 則回傳 Null
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

// 測試 APIs
employees.firstNotNullOfOrNull { it.skills }

emptyList.firstNotNullOfOrNull { it.skills }
nothingInList.firstNotNullOfOrNull { it.skills }
