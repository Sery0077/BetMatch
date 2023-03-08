package sery.vlasenko.betmatch.data.repository.news

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.NewsItem
import sery.vlasenko.betmatch.model.Result

interface INewsRepository {
    fun getNews(): Flow<Result<List<NewsItem>>>
}