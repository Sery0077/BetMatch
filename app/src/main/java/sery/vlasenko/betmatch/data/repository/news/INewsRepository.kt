package sery.vlasenko.betmatch.data.repository.news

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.DataResult
import sery.vlasenko.betmatch.model.NewsItem

interface INewsRepository {
    fun getNews(): Flow<DataResult<List<NewsItem>>>
}