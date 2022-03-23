package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Student

/**
 * associateBy() - 依 λ 轉換 Map 的 Key 後寫入指定 Collection
 */

// 建立範例資料
val students = listOf(
    Student(1, "John", "Doe", "john.doe@gmail.com", 1),
    Student(2, "Tommy", "Lee", "tommy.leen@hotmail.com", 2),
    Student(3, "Sean", "Lin", "sean.lin@mail.yahoo.com", 3),
)
val mutableStudentList = mutableMapOf(
    4 to Student(4, "Tim", "Wong", "tim.wong@gmail.com", 4)
)

// 測試 APIs
students.associateByTo(mutableStudentList) { it.id }
