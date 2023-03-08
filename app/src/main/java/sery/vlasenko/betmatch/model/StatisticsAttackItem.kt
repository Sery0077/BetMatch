package sery.vlasenko.betmatch.model

import com.squareup.moshi.Json

data class StatisticsAttackItem(
    @field:Json(name = "Команда")
    val team: String,
    @field:Json(name = "Турнир")
    val tournament: String,
    @field:Json(name = "Удары з.и.")
    val shots: String,
    @field:Json(name = "Удары ВСтв з.и.")
    val shots_on_post: String,
    @field:Json(name = "Дриблинг з.и.")
    val dribbling: String,
    @field:Json(name = "Дано фолов з.и.")
    val falls: String,
    @field:Json(name = "Рейтинг")
    val rating: String,
)
