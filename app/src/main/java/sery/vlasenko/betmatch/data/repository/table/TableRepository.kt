package sery.vlasenko.betmatch.data.repository.table

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sery.vlasenko.betmatch.data.BetMatchService
import sery.vlasenko.betmatch.model.Result
import sery.vlasenko.betmatch.model.TableItem
import javax.inject.Inject

class TableRepository @Inject constructor(private val service: BetMatchService) : ITableRepository {
    override fun getTables(): Flow<Result<List<TableItem>>> {
        return flow {
            emit(Result.loading())

            val result = try {
                val news = service.getTable()
                Result.success(news)
            } catch (e: Exception) {
                Result.error("Error: ${e.message}", null)
            }

            emit(result)
        }.flowOn(Dispatchers.IO)
    }
}