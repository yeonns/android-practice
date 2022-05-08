package com.example.android_practice.data.repository.movie.datasource

import com.example.android_practice.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>
}