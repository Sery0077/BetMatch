package sery.vlasenko.betmatch.data.repository.statistics

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sery.vlasenko.betmatch.data.BetMatchService
import sery.vlasenko.betmatch.model.DataResult
import sery.vlasenko.betmatch.model.StatisticsAttackItem
import sery.vlasenko.betmatch.model.StatisticsDefenseItem
import javax.inject.Inject

class StatisticsRepository @Inject constructor(private val service: BetMatchService) :
    IStatisticsRepository {
    override fun getDefenseStatistics(): Flow<DataResult<List<StatisticsDefenseItem>>> {
        return flow {
            emit(DataResult.loading())

            val result = try {
                val news = service.getStatDefense()
                DataResult.success(news)
            } catch (e: Exception) {
                DataResult.error("Error: ${e.message}", null)
            }

            emit(result)
        }.flowOn(Dispatchers.IO)
    }

    override fun getAttackStatistics(): Flow<DataResult<List<StatisticsAttackItem>>> {
        return flow {
            emit(DataResult.loading())

            val result = try {
                val news = service.getStatAttack()
                DataResult.success(news)
            } catch (e: Exception) {
                DataResult.error("Error: ${e.message}", null)
            }

            emit(result)
        }.flowOn(Dispatchers.IO)
    }
}