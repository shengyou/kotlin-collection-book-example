package io.kraftsman.collection.technique.creation

/**
 * Iterable - 實例化建立 Iterable
 */

// 建立範例資料
Iterable {
    iterator {
        yield(2)
        yield(4)
        yieldAll(1..5 step 2)
    }
}.joinToString(",")
