package app.systems.myearnings.impl.domain.repositories

import app.systems.myearnings.other.Either
import app.systems.myearnings.impl.errors.Failure

interface StockRepository {
    suspend fun search(text: String?, page: String, limit: String): Either<List<String>, Failure>
}