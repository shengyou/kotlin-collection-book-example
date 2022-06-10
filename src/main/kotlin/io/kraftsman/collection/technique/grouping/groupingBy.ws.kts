package io.kraftsman.collection.technique.grouping

/**
 * groupingBy() - 分群後再做二次操作
 */

// 建立範例資料
val languages = listOf(
    "java",
    "scala",
    "kotlin",
    "javascript",
    "groovy",
    "ruby",
    "react",
    "swift"
)

// 示範使用方式
languages.groupingBy {
    it.first().uppercase()
}.eachCount()

languages.groupBy {
    it.first().uppercase()
}.map {
    it.key to it.value.count()
}.toMap()
