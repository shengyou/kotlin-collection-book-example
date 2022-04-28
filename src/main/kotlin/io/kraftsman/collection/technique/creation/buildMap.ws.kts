package io.kraftsman.collection.technique.creation

/**
 * buildMap() - 以 Builder 函式建立 Map
 */

// 建立範例資料
buildMap {
    put("Apple", 100)
    putAll(
        mapOf(
            "Banana" to 12,
            "Orange" to 60,
        )
    )
}
