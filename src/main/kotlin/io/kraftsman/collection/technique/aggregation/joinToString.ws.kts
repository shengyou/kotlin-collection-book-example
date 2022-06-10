package io.kraftsman.collection.technique.aggregation

/**
 * joinToString() - 將集合元素合併成字串
 */

// 建立範例資料
val numberStrings = listOf("one", "two", "three", "four")
var manualOutput = ""

// 示範使用方式
println(numberStrings)

numberStrings.toString()

numberStrings.forEachIndexed { index, s ->
    manualOutput += if (index == 0) {
        "[$s, "
    } else if ((index + 1) == numberStrings.size) {
        "$s]"
    } else {
        "$s, "
    }
}
println(manualOutput)

numberStrings.joinToString()

numberStrings.joinToString(
    separator = " | ",
    prefix = "start: ",
    postfix = ": end"
)

numberStrings.joinToString(
    "",
    limit = 2,
    truncated = "..."
)

numberStrings.joinToString {
    "Element: ${it.uppercase()}"
}
