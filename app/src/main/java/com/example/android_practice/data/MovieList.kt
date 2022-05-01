package com.example.android_practice.data
import com.example.android_practice.data.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>,
)