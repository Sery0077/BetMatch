package sery.vlasenko.betmatch.model

import retrofit2.http.GET
import sery.vlasenko.betmatch.model.pojo.*

interface BetMatchService {
    @GET("data_tournament_tables.json")
    suspend fun getTable(): Result<List<TableItem>>

    @GET("data_statistic_defense.json")
    suspend fun getStatDefense(): Result<List<StatisticsDefenseItem>>

    @GET("data_statistic_attack.json")
    suspend fun getStatAttack(): Result<List<StatisticsAttackItem>>

    @GET("news.json")
    suspend fun getNews(): List<NewsItem>
}