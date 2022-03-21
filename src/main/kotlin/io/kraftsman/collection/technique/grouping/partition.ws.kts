package io.kraftsman.collection.technique.grouping

import io.kraftsman.collection.data.Student
import io.kraftsman.collection.data.Teacher

/**
 * partition() - 依照條件分成通過與不通過的兩群
 */

// 建立範例資料
val staff = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Teacher(5, "Sean", "Lin", 6)
)

val people = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Student(5, "Sean", "Lin", "sean.lin@gmail.com", 6)
)

// 測試 APIs
val (junior, senior) = staff.partition { it.level <= 3 }
val (teachers, students) = people.partition { it is Teacher }
