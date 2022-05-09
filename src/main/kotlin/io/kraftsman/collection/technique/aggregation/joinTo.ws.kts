package io.kraftsman.collection.technique.aggregation

/**
 * joinTo() - 將集合元素合併成字串後附加至 Appendable
 */

// 建立範例資料
val numberStrings = listOf("one", "two", "three", "four")
val buffer = StringBuffer("The list of numbers: ")

// 測試 APIs
numberStrings.joinTo(
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

println(buffer)
