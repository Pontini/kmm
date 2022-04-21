package app.systems.myearnings.publ.domain.entities

interface GetStocksByFilter {
    suspend operator fun invoke():String
}