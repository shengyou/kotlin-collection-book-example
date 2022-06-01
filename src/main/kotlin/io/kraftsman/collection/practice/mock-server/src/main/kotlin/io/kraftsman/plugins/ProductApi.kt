package io.kraftsman.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureProductApi() {

    routing {
        get("/api/v1/products") {
            call.respond(
                mapOf(
                    "data" to "data",
                    "meta" to "meta"
                )
            )
        }
    }
}
