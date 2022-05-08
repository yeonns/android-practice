package com.example.android_practice.data.repository.tvshow.datasource

import com.example.android_practice.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows(): Response<TvShowList>
}