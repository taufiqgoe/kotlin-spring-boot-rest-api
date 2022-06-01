package id.taufiq.kotlinspringbootrestapi.service

import id.taufiq.kotlinspringbootrestapi.data.entity.Movie

interface MovieService {
    fun create(movie: Movie): Movie
    fun get(id: String): Movie
    fun update(id: String, movie: Movie): Movie
    fun delete()
}