package app.systems.myearnings.impl.external.remote

import app.systems.myearnings.sample.Greeting
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class StockClient {
    private val client = HttpClient() // TODO Add DI here

    private suspend fun getHtml(): String {
        val response = client.get("https://ktor.io/docs")
        return response.bodyAsText()
    }

    fun main() {
        val mainScope = MainScope()
        mainScope.launch {
            kotlin.runCatching {
                getHtml()
            }.onSuccess {
                print(it)
            }.onFailure {
                print(it.message)
            }
        }

    }
}