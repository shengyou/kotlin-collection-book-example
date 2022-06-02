package io.kraftsman.plugins

import io.kraftsman.dtos.Meta
import io.kraftsman.dtos.Product
import io.kraftsman.dtos.ProductApiResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.math.ceil

fun Application.configureProductApi() {

    val products = (1..50).map {
        Product(
            sku = "SKU-001",
            name = "Product #$it",
            description = "Product description",
            price = 100,
            rating = 3.2,
            thumbnail = "https://api.lorem.space/image/furniture?w=300&h=300",
            createdAt = "2022/06/01 00:00:00",
            updatedAt = "2022/06/01 00:00:00",
        )
    }

    routing {
        get("/api/v1/products") {

            val currentPage = 1
            val total = products.count()
            val perPage = 10
            val lastPage = listOf(ceil(total.toDouble() / perPage).toInt(), 1).maxOrNull()!!

            if (currentPage > lastPage) call.respond(
                HttpStatusCode.NotFound,
                mapOf("message" to "The requested page not found")
            )

            val index = currentPage - 1
            val currentPageProduct = products.chunked(perPage)[index]
            val from = index * perPage + 1
            val to = from + currentPageProduct.count() - 1

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
