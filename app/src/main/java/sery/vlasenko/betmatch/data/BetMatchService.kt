package sery.vlasenko.betmatch.data

import retrofit2.http.GET
import sery.vlasenko.betmatch.model.NewsItem
import sery.vlasenko.betmatch.model.StatisticsAttackItem
import sery.vlasenko.betmatch.model.StatisticsDefenseItem
import sery.vlasenko.betmatch.model.TableItem

interface BetMatchService {
    @GET("data_tournament_tables.json")
    suspend fun getTable(): List<TableItem>

    @GET("data_statistic_defense.json")
    suspend fun getStatDefense(): List<StatisticsDefenseItem>

    @GET("data_statistic_attack.json")
    suspend fun getStatAttack(): List<StatisticsAttackItem>

    @GET("news.json")
    suspend fun getNews(): List<NewsItem>
}