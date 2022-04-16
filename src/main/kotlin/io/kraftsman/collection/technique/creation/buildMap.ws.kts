package io.kraftsman.collection.technique.creation

/**
 * buildMap() - 依 λ 建立 Map
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
