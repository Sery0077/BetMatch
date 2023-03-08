package sery.vlasenko.betmatch.model.repository

import retrofit2.http.GET
import sery.vlasenko.betmatch.model.pojo.StatisticsAttackItem
import sery.vlasenko.betmatch.model.pojo.StatisticsDefenseItem
import sery.vlasenko.betmatch.model.pojo.TableItem

interface BetMatchService {
    @GET("data_tournament_tables")
    suspend fun getTable(): List<TableItem>

    @GET("data_statistic_defense")
    suspend fun getStatDefense(): List<StatisticsDefenseItem>

    @GET("data_statistic_attack")
    suspend fun getStatAttack(): List<StatisticsAttackItem>
}