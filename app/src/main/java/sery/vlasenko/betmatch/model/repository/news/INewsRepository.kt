package sery.vlasenko.betmatch.model.repository.news

import kotlinx.coroutines.flow.Flow
import sery.vlasenko.betmatch.model.pojo.NewsItem
import sery.vlasenko.betmatch.model.pojo.Result

interface INewsRepository {
    fun getNews(): Flow<Result<List<NewsItem>>>
}