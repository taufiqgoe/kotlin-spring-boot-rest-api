package id.taufiq.kotlinspringbootrestapi.service

import id.taufiq.kotlinspringbootrestapi.data.entity.Movie

interface MovieService {
    fun create(movie: Movie): Movie
    fun get()
    fun update()
    fun delete()
}