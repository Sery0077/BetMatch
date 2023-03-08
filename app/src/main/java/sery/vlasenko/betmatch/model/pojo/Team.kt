package sery.vlasenko.betmatch.model.pojo

import com.squareup.moshi.Json

data class Team(
    @field:Json(name = "Команда")
    val team: String,
    @field:Json(name = "Игры")
    val games: Int,
    @field:Json(name = "В")
    val wins: Int,
    @field:Json(name = "Н")
    val draws: Int,
    @field:Json(name = "П")
    val defeats: Int,
    @field:Json(name = "Мячи")
    val balls: String,
    @field:Json(name = "Очки")
    val scores: Int,
    @field:Json(name = "% очков")
    val scorePercent: String
)