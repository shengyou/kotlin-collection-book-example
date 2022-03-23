package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Student

/**
 * associateTo() - 依 λ 處理的 Pair 轉換成 Map 後寫入指定 Collection
 */

// 建立範例資料
val students = listOf(
    Student(1, "John", "Doe", "john.doe@gmail.com", 1),
    Student(2, "Tommy", "Lee", "tommy.leen@hotmail.com", 2),
    Student(3, "Sean", "Lin", "sean.lin@mail.yahoo.com", 3),
)
val mutableStudentList = mutableMapOf(
    4 to "Wong Tim"
)

// 測試 APIs
students.associateTo(mutableStudentList) {
    it.id to "${it.lastName} ${it.firstName}"
}
