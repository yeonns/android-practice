package com.example.android_practice.presentation.di.movie

import com.example.android_practice.domain.usecase.GetMoviesUseCase
import com.example.android_practice.domain.usecase.UpdateMoviesUseCase
import com.example.android_practice.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase, updateMoviesUseCase
        )
    }
}