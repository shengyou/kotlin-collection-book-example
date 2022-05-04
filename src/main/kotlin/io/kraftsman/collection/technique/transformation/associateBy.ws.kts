package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Student

/**
 * associateBy() - 將集合依 λ 選擇的 Key 並與原本元素對應成 Map
 */

// 建立範例資料
val students = listOf(
    Student(1, "John", "Doe", "john.doe@gmail.com", 1),
    Student(2, "Tommy", "Lee", "tommy.leen@hotmail.com", 2),
    Student(3, "Sean", "Lin", "sean.lin@mail.yahoo.com", 3),
    Student(4, "Tim", "Wong", "tim.wong@gmail.com", 2),
    Student(5, "Sammie", "Ho", "sammie.ho@163.com", 5),
    Student(6, "Simon", "Fan", "simon.fan@gmail.com", 2)
)

// 測試 APIs
students.associateBy { it.id }

students.associateBy(
    { it.id },
    { "${it.lastName} ${it.firstName}" }
)
