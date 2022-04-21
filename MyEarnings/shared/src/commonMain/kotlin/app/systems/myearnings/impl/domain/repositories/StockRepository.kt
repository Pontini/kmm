package app.systems.myearnings.impl.domain.repositories

import app.systems.myearnings.other.Either
import app.systems.myearnings.impl.errors.Failure
import app.systems.myearnings.publ.domain.entities.StockEntity

interface StockRepository {
    suspend fun search(text: String?): Either<List<StockEntity>, Failure>
}