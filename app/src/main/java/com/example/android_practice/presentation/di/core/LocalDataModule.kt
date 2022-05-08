package com.example.android_practice.presentation.di.core

import com.example.android_practice.data.db.ArtistDao
import com.example.android_practice.data.db.MovieDao
import com.example.android_practice.data.db.TvShowDao
import com.example.android_practice.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.android_practice.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.example.android_practice.data.repository.movie.datasource.MovieLocalDataSource
import com.example.android_practice.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.example.android_practice.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.android_practice.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }
}