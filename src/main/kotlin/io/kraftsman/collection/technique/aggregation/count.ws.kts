package io.kraftsman.collection.technique.aggregation

import io.kraftsman.collection.data.Student

/**
 * count() - 計算 Collection 裡的數量
 */

// 建立範例資料
val students = listOf(
    Student(1, "John", "Doe", "john.doe@gmail.com", 1),
    Student(2, "Tommy", "Lee", "tommy.leen@hotmail.com", 2),
    Student(3, "Sean", "Lin", "sean.lin@mail.yahoo.com", 3),
    Student(4, "Tim", "Wong", "tim.wong@gmail.com", 4),
    Student(5, "Sammie", "Ho", "sammie.ho@163.com", 5),
    Student(6, "Simon", "Fan", "simon.fan@gmail.com", 6),
)

// 測試 APIs
students.size
students.count()
students.count { it.grade > 4 }
