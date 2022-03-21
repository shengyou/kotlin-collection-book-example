package io.kraftsman.collection.technique.grouping

import io.kraftsman.collection.data.Student
import io.kraftsman.collection.data.Teacher

/**
 * filterIsInstance<T>() - 依照實例類別進行過濾
 */

// 建立範例資料
val people = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Student(5, "Sean", "Lin", "sean.lin@gmail.com", 6)
)

// 測試 APIs
people.filterIsInstance<Teacher>()
people.filterIsInstance<Student>()
