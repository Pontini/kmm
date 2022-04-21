package app.systems.myearnings.impl.infra.repositories

import app.systems.myearnings.impl.domain.repositories.StockRepository
import app.systems.myearnings.impl.errors.Failure
import app.systems.myearnings.other.Either

class StockRepositoryImpl(

) : StockRepository {
    override suspend fun search(
        text: String?,
        page: String,
        limit: String
    ): Either<List<String>, Failure> {
       TODO("Not yet implemented")
    }

}