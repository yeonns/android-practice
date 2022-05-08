package com.example.android_practice.domain.usecase

import com.example.android_practice.domain.repository.TvShowRepository
import com.example.android_practice.data.model.tvshow.TvShow

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}