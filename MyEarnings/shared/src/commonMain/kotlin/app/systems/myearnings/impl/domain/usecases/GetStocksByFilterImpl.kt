package app.systems.myearnings.impl.domain.usecases

import app.systems.myearnings.impl.domain.repositories.StockRepository
import app.systems.myearnings.impl.errors.Failure
import app.systems.myearnings.other.Either
import app.systems.myearnings.publ.domain.entities.StockEntity
import app.systems.myearnings.publ.domain.StockFilter
import app.systems.myearnings.publ.domain.usecases.GetStocksByFilter


class GetStocksByFilterImpl(private val repository: StockRepository) : GetStocksByFilter {
    override suspend fun invoke(filter: StockFilter): Either<List<StockEntity>,Failure> {
        if (filter.keywords.isNullOrEmpty()) {
            return Either.Error(Failure.InputInvalid(message = "My custom message that my domain must understand"))
        }
        return repository.search(filter.keywords)

    }
}