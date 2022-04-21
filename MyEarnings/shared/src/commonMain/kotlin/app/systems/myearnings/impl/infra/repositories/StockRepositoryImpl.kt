package app.systems.myearnings.impl.infra.repositories

import app.systems.myearnings.impl.domain.repositories.StockRepository
import app.systems.myearnings.impl.errors.Failure
import app.systems.myearnings.impl.infra.datasources.StockDataSource
import app.systems.myearnings.impl.other.CustomException
import app.systems.myearnings.other.Either
import app.systems.myearnings.publ.domain.entities.StockEntity

class StockRepositoryImpl(
    private val datasource: StockDataSource,
) : StockRepository {
    override suspend fun search(
        symbol: String?,

        ): Either<List<StockEntity>, Failure> {
        return try {
            symbol?.let {
                val data = datasource.searchForSymbol(symbol)
                return Either.Success(listOf())
            } ?: run {
                return Either.Error(Failure.InputInvalid())
            }
        } catch (e: CustomException) {
            when (e) {
                is CustomException.Network -> TODO()
                is CustomException.SessionExpired -> TODO()
                is CustomException.TimeOutException -> TODO()
                is CustomException.Unknown -> TODO()
            }
        }
    }

}