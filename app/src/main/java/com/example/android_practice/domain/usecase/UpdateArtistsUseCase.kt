package com.example.android_practice.domain.usecase

import com.example.android_practice.domain.repository.ArtistRepository
import com.example.android_practice.data.model.artist.Artist

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}