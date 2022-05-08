package com.example.android_practice.domain.usecase

import com.example.android_practice.domain.repository.MovieRepository
import com.example.android_practice.data.model.movie.Movie

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}