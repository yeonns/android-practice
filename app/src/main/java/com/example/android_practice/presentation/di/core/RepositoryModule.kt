package com.example.android_practice.presentation.di.core

import com.example.android_practice.data.repository.artist.ArtistRepositoryImpl
import com.example.android_practice.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.android_practice.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.android_practice.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.android_practice.data.repository.movie.MovieRepositoryImpl
import com.example.android_practice.data.repository.movie.datasource.MovieCacheDataSource
import com.example.android_practice.data.repository.movie.datasource.MovieLocalDataSource
import com.example.android_practice.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.android_practice.data.repository.tvshow.TvShowRepositoryImpl
import com.example.android_practice.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.android_practice.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.android_practice.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.example.android_practice.domain.repository.ArtistRepository
import com.example.android_practice.domain.repository.MovieRepository
import com.example.android_practice.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource, movieCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(tvShowRemoteDataSource, tvShowLocalDataSource, tvShowCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(artistRemoteDataSource, artistLocalDataSource, artistCacheDataSource)
    }
}