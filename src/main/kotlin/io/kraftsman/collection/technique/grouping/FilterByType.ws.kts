//import com.github.javafaker.Faker
//import io.kraftsman.collection.data.Student
//import io.kraftsman.collection.data.Teacher
//import java.util.*
//import kotlin.random.Random
//
////val faker: Faker = Faker.instance(Locale.TRADITIONAL_CHINESE)
//val people = (1..10).map {
//    if ((it % 2) == 0) {
//        Student(
//            id = it,
//            firstName = faker.name().firstName(),
//            lastName = faker.name().lastName(),
//            email = faker.internet().emailAddress(),
//            grade = faker.number().numberBetween(1, 6),
//        )
//    } else {
//        Teacher(
//            id = it,
//            firstName = faker.name().firstName(),
//            lastName = faker.name().lastName(),
//            level = faker.number().numberBetween(1, 10),
//        )
//    }
//}.toMutableList()
//
//people.forEach {
//    println("${it.lastName}${it.firstName} (${it.javaClass})")
//}
//
////people.filterIsInstance<Teacher>()
////    .forEach {
////        println("${it.lastName}${it.firstName}: ${it.level}")
////    }
////
////people.partition {
////    it.javaClass == Teacher::class.java
////}
//
//people.fill(
//    Teacher(
//        id = Random.nextInt(),
//        firstName = "Filled Teacher",
//        lastName = faker.name().lastName(),
//        level = faker.number().numberBetween(1, 10),
//    )
//)
//people.forEach {
//    println(it.firstName)
//}
//
//val x = listOf(1, 2, 3, 4, 5)
//x.scan(10) { acc, i ->
//    acc + i
//}
//
//val numberMap = mapOf(1 to "one", 2 to "two", 3 to "three")
//numberMap.forEach { key, value ->
//    println("key=$key, value=$value")
//}
