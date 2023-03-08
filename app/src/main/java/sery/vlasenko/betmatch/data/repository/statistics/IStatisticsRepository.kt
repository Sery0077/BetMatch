package sery.vlasenko.betmatch.data.repository.statistics

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.Result
import sery.vlasenko.betmatch.model.StatisticsAttackItem
import sery.vlasenko.betmatch.model.StatisticsDefenseItem

interface IStatisticsRepository {
    fun getDefenseStatistics(): Flow<Result<List<StatisticsDefenseItem>>>
    fun getAttackStatistics(): Flow<Result<List<StatisticsAttackItem>>>
}