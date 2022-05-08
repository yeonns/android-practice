package com.example.android_practice.presentation.di.tvshow

import com.example.android_practice.domain.usecase.GetTvShowsUseCase
import com.example.android_practice.domain.usecase.UpdateTvShowsUseCase
import com.example.android_practice.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase, updateTvShowsUseCase
        )
    }
}