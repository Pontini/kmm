package app.systems.myearnings.impl.infra.datasources

import io.ktor.client.statement.*

interface StockDataSource {
    suspend fun searchForSymbol(keywords: String): HttpResponse
    suspend fun searchStockBySymbol(symbol: String): HttpResponse
}