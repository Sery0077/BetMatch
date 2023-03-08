package sery.vlasenko.betmatch.model.repository.table

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sery.vlasenko.betmatch.model.BetMatchService
import sery.vlasenko.betmatch.model.pojo.Result
import sery.vlasenko.betmatch.model.pojo.TableItem
import javax.inject.Inject

class TableRepository @Inject constructor(private val service: BetMatchService) : ITableRepository {
    override fun getTables(): Flow<Result<List<TableItem>>> {
        return flow {
            emit(Result.loading())

            val result = service.getTable()
            emit(result)
        }.flowOn(Dispatchers.IO)
    }
}