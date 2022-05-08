package com.example.android_practice.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android_practice.domain.usecase.GetTvShowsUseCase
import com.example.android_practice.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTvShowsUseCase, updateTvShowsUseCase) as T
    }
}