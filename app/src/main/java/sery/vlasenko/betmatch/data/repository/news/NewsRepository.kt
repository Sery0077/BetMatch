package sery.vlasenko.betmatch.data.repository.news

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import okio.IOException
import sery.vlasenko.betmatch.data.BetMatchService
import sery.vlasenko.betmatch.model.NewsItem
import sery.vlasenko.betmatch.model.Result
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val service: BetMatchService
) : INewsRepository {
    override fun getNews(): Flow<Result<List<NewsItem>>> {
        return flow {
            emit(Result.loading())

            val result = try {
                val news = service.getNews()
                Result.success(news)
            } catch (e: Exception) {
                Result.error("Error: ${e.message}", null)
            }

            emit(result)
        }.flowOn(Dispatchers.IO)
    }
} 