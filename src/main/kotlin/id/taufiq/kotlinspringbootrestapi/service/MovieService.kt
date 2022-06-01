package id.taufiq.kotlinspringbootrestapi.service

import id.taufiq.kotlinspringbootrestapi.data.entity.Movie

interface MovieService {
    fun create(movie: Movie): Movie
    fun get(id: Long): Movie
    fun update(id: Long, movie: Movie): Movie
    fun delete(id: Long): Long

}