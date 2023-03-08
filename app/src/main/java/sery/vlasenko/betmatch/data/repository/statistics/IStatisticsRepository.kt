package sery.vlasenko.betmatch.data.repository.statistics

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.DataResult
import sery.vlasenko.betmatch.model.StatisticsAttackItem
import sery.vlasenko.betmatch.model.StatisticsDefenseItem

interface IStatisticsRepository {
    fun getDefenseStatistics(): Flow<DataResult<List<StatisticsDefenseItem>>>
    fun getAttackStatistics(): Flow<DataResult<List<StatisticsAttackItem>>>
}