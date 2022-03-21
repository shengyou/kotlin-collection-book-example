package io.kraftsman.collection.technique.conversion

/**
 * toProperties() - 將 Map<String, String> 轉成 Java Properties Class
 */

// 建立範例資料
val languages = mapOf(
    "Kotlin" to "2011",
    "Java" to "1995",
    "C++" to "1980",
)

// 測試 APIs
val props = languages.toProperties()

languages.get("Kotlin")
languages.get("PHP")
props.getProperty("Kotlin")
props.getProperty("PHP")

languages.getOrDefault("Kotlin", "default")
languages.getOrDefault("PHP", "default")
props.getProperty("Kotlin", "default")
props.getProperty("PHP", "default")
