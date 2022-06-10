package io.kraftsman.collection.technique.conversion

/**
 * 轉型成原始型別 Array
 *
 * toIntArray()
 * toBooleanArray()
 * toCharArray()
 * toFloatArray()
 * toDoubleArray()
 * toShortArray()
 * toLongArray()
 * toByteArray()
 */

// 建立範例資料
val integer = listOf(1, 2, 3, 4, 5)
val boolean = listOf(true, false, true, false, false)
val char = listOf('a', 'b', 'c', 'd', 'e')
val float = listOf(2.7182817f)
val double = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
val long = listOf(3000000000, 1L)
val short = listOf<Short>(-32768, 32767)
val bites = listOf<Byte>(1, 2, 3, 4, 5)

// 示範使用方式
integer.toIntArray()
boolean.toBooleanArray()
char.toCharArray()
float.toFloatArray()
double.toDoubleArray()
long.toLongArray()
short.toShortArray()
bites.toByteArray()
