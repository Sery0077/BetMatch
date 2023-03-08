package sery.vlasenko.betmatch.data.repository.news

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import sery.vlasenko.betmatch.data.BetMatchService
import sery.vlasenko.betmatch.model.DataResult
import sery.vlasenko.betmatch.model.NewsItem
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val service: BetMatchService
) : INewsRepository {
    override fun getNews(): Flow<DataResult<List<NewsItem>>> {
        return flow {
            emit(DataResult.loading())

            val result = try {
                val news = service.getNews()
                DataResult.success(news)
            } catch (e: Exception) {
                DataResult.error("Error: ${e.message}", null)
            }

            emit(result)
        }.flowOn(Dispatchers.IO)
    }
} 