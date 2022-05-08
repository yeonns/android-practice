package com.example.android_practice.data.repository.tvshow.datasourceImpl

import com.example.android_practice.data.api.TMDBService
import com.example.android_practice.data.model.tvshow.TvShowList
import com.example.android_practice.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDataSource {

    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)
}