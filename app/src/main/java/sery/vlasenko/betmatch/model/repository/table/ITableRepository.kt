package sery.vlasenko.betmatch.model.repository.table

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.pojo.TableItem
import sery.vlasenko.betmatch.model.pojo.Result

interface ITableRepository {
    fun getTables(): Flow<Result<List<TableItem>>>
}