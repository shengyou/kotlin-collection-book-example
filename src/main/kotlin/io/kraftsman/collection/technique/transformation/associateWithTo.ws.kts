package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Student

/**
 * associateWith() - 將集合依 λ 選擇的 Value 並與原本元素對應成 Map 後寫入指定集合
 */

// 建立範例資料
val students = listOf(
    Student(1, "John", "Doe", "john.doe@gmail.com", 1),
    Student(2, "Tommy", "Lee", "tommy.leen@hotmail.com", 2),
    Student(3, "Sean", "Lin", "sean.lin@mail.yahoo.com", 3)
)
val lookupTable = mutableMapOf(
    Student(4, "Tim", "Wong", "tim.wong@gmail.com", 4) to 4
)

// 測試 APIs
students.associateWithTo(lookupTable) { it.id }
