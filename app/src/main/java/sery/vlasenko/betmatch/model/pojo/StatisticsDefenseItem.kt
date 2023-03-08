package sery.vlasenko.betmatch.model.pojo

import com.squareup.moshi.Json

data class StatisticsDefenseItem(
    @field:Json(name = "Команда")
    val team: String,
    @field:Json(name = "Турнир")
    val tournament: String,
    @field:Json(name = "Удары з.и.")
    val shots: String,
    @field:Json(name = "Отборы з.и.")
    val selections: String,
    @field:Json(name = "Перехваты з.и.")
    val interceptions: String,
    @field:Json(name = "Фолы з.и.")
    val falls: String,
    @field:Json(name = "Офсайды з.и.")
    val offsides: String,
    @field:Json(name = "Рейтинг")
    val rating: String,
)