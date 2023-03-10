package sery.vlasenko.betmatch.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import sery.vlasenko.betmatch.data.repository.news.NewsRepository
import sery.vlasenko.betmatch.model.DataResult
import sery.vlasenko.betmatch.model.NewsItem
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val repository: NewsRepository): ViewModel() {
    private val _newsList = MutableLiveData<DataResult<List<NewsItem>>>()
    val newsList: LiveData<DataResult<List<NewsItem>>>
        get() = _newsList

    init {
        getNews()
    }

    private fun getNews() {
        viewModelScope.launch {
            repository.getNews().collect() {
                _newsList.value = it
            }
        }
    }
}