package io.kraftsman.collection.technique.transformation

import io.kraftsman.collection.data.Student

/**
 * associateTo() - 將集合依 λ 轉換成 Map 後附加至指定集合
 */

// 建立範例資料
val students = listOf(
    Student(1, "John", "Doe", "john.doe@gmail.com", 1),
    Student(2, "Tommy", "Lee", "tommy.leen@hotmail.com", 2),
    Student(3, "Sean", "Lin", "sean.lin@mail.yahoo.com", 3)
)
val lookupTable = mutableMapOf(
    4 to "Wong Tim"
)

// 示範使用方式
students.associateTo(lookupTable) {
    it.id to "${it.lastName} ${it.firstName}"
}

lookupTable[5] = "Sammie Ho"
