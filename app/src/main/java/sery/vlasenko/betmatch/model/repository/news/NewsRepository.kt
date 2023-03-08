package sery.vlasenko.betmatch.model.repository.news

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sery.vlasenko.betmatch.model.BetMatchService
import sery.vlasenko.betmatch.model.pojo.NewsItem
import sery.vlasenko.betmatch.model.pojo.Result
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val service: BetMatchService
) : INewsRepository {
    override fun getNews(): Flow<Result<List<NewsItem>>> {
        return flow {
            emit(Result.loading())

            val news = service.getNews()

            val result = if (news.isNullOrEmpty()) {
                Result.error("Error", null)
            } else {
                Result.success(news)
            }

            emit(result)
        }.flowOn(Dispatchers.IO)
    }
} 