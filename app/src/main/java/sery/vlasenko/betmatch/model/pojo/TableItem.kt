package sery.vlasenko.betmatch.model.pojo

import com.squareup.moshi.Json

data class TableItem(
    val name: String,
    val dates: String,
    val category: String,
    val players_count: Int,
    val icon: String,
    @Json(name = "data")
    val data: Map<String, Team>
)