package sery.vlasenko.betmatch.data.repository.table

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.DataResult
import sery.vlasenko.betmatch.model.TableItem

interface ITableRepository {
    fun getTables(): Flow<DataResult<List<TableItem>>>
}