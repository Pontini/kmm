package app.systems.myearnings.publ.domain.usecases

import app.systems.myearnings.impl.errors.Failure
import app.systems.myearnings.other.Either
import app.systems.myearnings.publ.domain.entities.StockEntity
import app.systems.myearnings.publ.domain.StockFilter

interface GetStocksByFilter {
    suspend operator fun invoke(filter: StockFilter): Either<List<StockEntity>, Failure>
}