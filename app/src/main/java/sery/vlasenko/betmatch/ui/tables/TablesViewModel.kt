package sery.vlasenko.betmatch.ui.tables

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import sery.vlasenko.betmatch.BuildConfig
import sery.vlasenko.betmatch.model.pojo.TableItem
import sery.vlasenko.betmatch.model.repository.BetMatchService
import java.util.concurrent.TimeUnit

class TablesViewModel : ViewModel() {

}