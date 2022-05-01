package io.kraftsman.collection.technique.grouping

import io.kraftsman.collection.data.Student
import io.kraftsman.collection.data.Teacher

/**
 * filterIsInstanceTo() - 依照實例類別進行過濾後附加至指定集合
 */

// 建立範例資料
val people = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Student(5, "Sean", "Lin", "sean.lin@gmail.com", 6)
)
val teachers = mutableListOf(
    Teacher(2, "Sammy", "Cheng", 2),
)
val emptyList = mutableListOf<Teacher>()

// 測試 APIs
people.filterIsInstanceTo(teachers)

people.filterIsInstanceTo(emptyList)

val staffs = people.filterIsInstanceTo(mutableListOf<Teacher>())
