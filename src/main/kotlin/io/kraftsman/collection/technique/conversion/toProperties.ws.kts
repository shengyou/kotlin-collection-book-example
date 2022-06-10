package io.kraftsman.collection.technique.conversion

/**
 * toProperties() - 將 Map<String, String> 轉成 Java Properties 類別
 */

// 建立範例資料
val languages = mapOf(
    "Kotlin" to "2011",
    "Java" to "1995",
    "C++" to "1980",
)

// 示範使用方式
val props = languages.toProperties()

props.getProperty("Kotlin")
props.getProperty("PHP")
props.getProperty("Kotlin", "default")
props.getProperty("PHP", "default")

languages.get("Kotlin")
languages.get("PHP")
languages.getOrDefault("Kotlin", "default")
languages.getOrDefault("PHP", "default")
