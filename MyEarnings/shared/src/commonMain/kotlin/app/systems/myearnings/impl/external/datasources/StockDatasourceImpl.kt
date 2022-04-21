package app.systems.myearnings.impl.external.datasources

import app.systems.myearnings.impl.infra.datasources.StockDataSource
import io.ktor.client.*
import io.ktor.client.statement.*


class StockDatasourceImpl(private val httpClient: HttpClient) : StockDataSource {
    override suspend fun searchForSymbol(keywords: String): HttpResponse {// HttpResponse TODO OR CustomException
        TODO("Not yet implemented")
    }

    override suspend fun searchStockBySymbol(symbol: String): HttpResponse  {// HttpResponse TODO OR CustomException
        TODO("Not yet implemented")
    }


}