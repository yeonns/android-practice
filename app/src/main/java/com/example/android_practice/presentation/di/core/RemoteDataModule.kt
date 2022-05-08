package com.example.android_practice.presentation.di.core

import com.example.android_practice.data.api.TMDBService
import com.example.android_practice.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.android_practice.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.example.android_practice.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.android_practice.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.example.android_practice.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.example.android_practice.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }
}