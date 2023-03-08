package sery.vlasenko.betmatch.data.repository.table

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.Result
import sery.vlasenko.betmatch.model.TableItem

interface ITableRepository {
    fun getTables(): Flow<Result<List<TableItem>>>
}