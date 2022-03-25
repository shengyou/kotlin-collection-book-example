package io.kraftsman.collection.technique.aggregation

/**
 * joinTo() - 將 Collection 裡的元素合併後寫入 Appendable
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")
val buffer = StringBuffer("The list of numbers: ")

// 測試 APIs
numbers.joinTo(
    buffer = buffer,
    separator = ", ",
    prefix = "→",
    postfix = "←",
    limit = 3,
    truncated = "..."
) { s ->
    s.lowercase().replaceFirstChar {
        it.uppercase()
    }
}
