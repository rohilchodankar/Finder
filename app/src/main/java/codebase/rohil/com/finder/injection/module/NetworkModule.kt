package codebase.rohil.com.finder.injection.module

import codebase.rohil.com.finder.AppConstants
import codebase.rohil.com.finder.BuildConfig
import codebase.rohil.com.finder.data.services.WeatherService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module class NetworkModule {

  @Provides @Singleton internal fun provideOkHttpClient(): OkHttpClient {
    val httpBuilder = OkHttpClient.Builder()
    if (BuildConfig.ENABLE_LOGGING) {
      val httpLoggingInterceptor = HttpLoggingInterceptor()
      httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
      httpBuilder.interceptors().add(httpLoggingInterceptor)
    }
    return httpBuilder.build()
  }

  @Provides @Singleton internal fun provideRestAdapter(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder().baseUrl(AppConstants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(okHttpClient)
        .build()
  }

  @Provides @Singleton internal fun provideApiService(restAdapter: Retrofit): WeatherService {
    return restAdapter.create(WeatherService::class.java)
  }
}
