package io.kraftsman.collection.technique.aggregation

/**
 * joinToString() - 將 Collection 裡的元素合併
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")
var forEachOutput = ""

// 測試 APIs
numbers.toString()
numbers.forEachIndexed { index, s ->
    forEachOutput += if (index == 0) {
        "[$s, "
    } else if ((index + 1) == numbers.size) {
        "$s]"
    } else {
        "$s, "
    }
}
numbers.joinToString()
numbers.joinToString(
    separator = " | ",
    prefix = "start: ",
    postfix = ": end"
)
numbers.joinToString(
    limit = 2,
    truncated = "..."
)
numbers.joinToString {
    "Element: ${it.uppercase()}"
}
