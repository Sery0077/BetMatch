package sery.vlasenko.betmatch.model.repository.statistics

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sery.vlasenko.betmatch.model.BetMatchService
import sery.vlasenko.betmatch.model.pojo.Result
import sery.vlasenko.betmatch.model.pojo.StatisticsAttackItem
import sery.vlasenko.betmatch.model.pojo.StatisticsDefenseItem
import javax.inject.Inject

class StatisticsRepository @Inject constructor(private val service: BetMatchService) :
    IStatisticsRepository {
    override fun getDefenseStatistics(): Flow<Result<List<StatisticsDefenseItem>>> {
        return flow {
            emit(Result.loading())

            val result = service.getStatDefense()
            emit(result)
        }.flowOn(Dispatchers.IO)
    }

    override fun getAttackStatistics(): Flow<Result<List<StatisticsAttackItem>>> {
        return flow {
            emit(Result.loading())

            val result = service.getStatAttack()
            emit(result)
        }.flowOn(Dispatchers.IO)
    }
}