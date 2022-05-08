package com.example.android_practice.data.repository.artist.datasource

import com.example.android_practice.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {

    suspend fun getArtists(): Response<ArtistList>
}