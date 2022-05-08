package com.example.android_practice.presentation.di

import com.example.android_practice.presentation.di.artist.ArtistSubComponent
import com.example.android_practice.presentation.di.movie.MovieSubComponent
import com.example.android_practice.presentation.di.tvshow.TvShowSubComponent

interface Injector {

    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}