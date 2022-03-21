package io.kraftsman.collection.technique.conversion

/**
 * 轉型成 Primitive Array
 *
 * toBooleanArray()
 * toByteArray()
 * toCharArray()
 * toDoubleArray()
 * toFloatArray()
 * toIntArray()
 * toLongArray()
 * toShortArray()
 * toUByteArray()
 * toUIntArray()
 * toULongArray()
 * toUShortArray()
 */

// 建立範例資料
val boolean = listOf(true, false, true, false, false)
val bites = listOf<Byte>(1, 2, 3, 4, 5)
val chars = listOf('a', 'b', 'c', 'd', 'e')
val double = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
val float = listOf(2.7182817f)
val integer = listOf(1, 2, 3, 4, 5)
val long = listOf(3000000000, 1L)
val short = listOf<Short>(-32768, 32767)

// 測試 APIs
boolean.toBooleanArray()
bites.toByteArray()
chars.toCharArray()
double.toDoubleArray()
float.toFloatArray()
integer.toIntArray()
long.toLongArray()
short.toShortArray()
