package io.kraftsman.plugins

import io.github.serpro69.kfaker.faker
import io.kraftsman.dtos.Meta
import io.kraftsman.dtos.Product
import io.kraftsman.dtos.ProductApiResponse
import io.kraftsman.extensions.format
import io.kraftsman.extensions.thumbnail
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.math.ceil
import kotlin.random.Random

fun Application.configureProductApi() {

    val faker = faker { }
    val amount = 50
    val products = (1..amount).map {
        Product(
            sku = faker.string.bothify("???-###", true),
            name = faker.commerce.productName(),
            description = faker.marketing.buzzwords(),
            price = Random.nextInt(10, 100000),
            rating = Random.nextDouble(1.0, 5.0).format(2),
            thumbnail = faker.commerce.thumbnail(),
            createdAt = LocalDateTime.now()
                .minusDays((amount - it).toLong())
                .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
            updatedAt = LocalDateTime.now()
                .minusDays((amount - it).toLong())
                .plusHours(Random.nextLong(3, 20))
                .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
        )
    }

    routing {
        get("/api/v1/products") {

            val currentPage = call.request.queryParameters["page"]?.toIntOrNull() ?: 1
            val total = products.count()
            val perPage = call.request.queryParameters["perPage"]?.toIntOrNull() ?: 10
            val lastPage = listOf(ceil(total.toDouble() / perPage).toInt(), 1).maxOrNull()!!

            if (currentPage > lastPage) call.respond(
                HttpStatusCode.NotFound,
                mapOf("message" to "The requested page not found")
            )

            val index = currentPage - 1
            val currentPageProduct = products.chunked(perPage)[index]
            val from = index * perPage + 1
            val to = from + currentPageProduct.count() - 1

            val seconds = call.request.queryParameters["time"]?.toIntOrNull()
            if (seconds != null) {
                withContext(Dispatchers.IO) {
                    delay(seconds * 1000L)
                }
            }

            call.respond(
                ProductApiResponse(
                    data = currentPageProduct,
                    meta = Meta(
                        currentPage = currentPage,
                        perPage = perPage,
                        lastPage = lastPage,
                        from = from,
                        to = to,
                        total = total,
                    )
                )
            )
        }
    }
}
