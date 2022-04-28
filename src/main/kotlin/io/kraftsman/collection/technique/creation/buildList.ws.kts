package io.kraftsman.collection.technique.creation

/**
 * buildList() - 以 Builder 函式建立 List
 */

// 建立範例資料
buildList {
    add('a')
    addAll(listOf('b', 'c'))
    add('d')
}
