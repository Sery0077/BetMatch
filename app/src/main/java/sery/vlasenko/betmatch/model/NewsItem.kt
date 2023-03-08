package sery.vlasenko.betmatch.model

import com.squareup.moshi.Json

data class NewsItem(
    @field:Json(name = "tittle")
    val title: String,
    val text: String,
    val img: String,
    val date: String,
)
