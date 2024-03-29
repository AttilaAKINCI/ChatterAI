package com.akinci.chatter.core.network

import com.akinci.chatter.core.network.json.UserServiceResponse
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.HttpStatusCode.Companion.OK
import io.ktor.http.headersOf
import java.nio.charset.Charset

class HttpEngineFactoryMock : HttpEngineFactory() {

    private val responseHeaders = headersOf(HttpHeaders.ContentType, "application/json")
    var statusCode: HttpStatusCode = OK
    var simulateException = false

    override fun create(): MockEngine {
        return MockEngine { request ->
            val path = request.url.encodedPath
            val content = when {
                path == "/api/" -> getRandomUser(statusCode, simulateException)
                else -> throw IllegalStateException("Unsupported path")
            }

            respond(
                content = content,
                status = statusCode,
                headers = responseHeaders,
            )
        }
    }

    private fun getRandomUser(
        statusCode: HttpStatusCode,
        simulateUserFetchError: Boolean,
    ): ByteArray {
        return when (statusCode) {
            OK -> {
                if (simulateUserFetchError) {
                    UserServiceResponse.EMPTY_RESPONSE.toByteArray(Charset.defaultCharset())
                } else {
                    UserServiceResponse.RAW_RESPONSE.toByteArray(Charset.defaultCharset())
                }
            }

            else -> throw Throwable(statusCode.description)
        }
    }
}
