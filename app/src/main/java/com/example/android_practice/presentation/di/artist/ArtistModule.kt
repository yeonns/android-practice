package com.example.android_practice.presentation.di.artist

import com.example.android_practice.domain.usecase.GetArtistsUseCase
import com.example.android_practice.domain.usecase.UpdateArtistsUseCase
import com.example.android_practice.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase, updateArtistsUseCase
        )
    }
}