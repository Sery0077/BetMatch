package sery.vlasenko.betmatch.model.repository.statistics

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.pojo.Result
import sery.vlasenko.betmatch.model.pojo.StatisticsAttackItem
import sery.vlasenko.betmatch.model.pojo.StatisticsDefenseItem

interface IStatisticsRepository {
    fun getDefenseStatistics(): Flow<Result<List<StatisticsDefenseItem>>>
    fun getAttackStatistics(): Flow<Result<List<StatisticsAttackItem>>>
}