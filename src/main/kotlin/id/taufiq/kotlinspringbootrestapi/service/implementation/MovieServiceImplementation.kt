package id.taufiq.kotlinspringbootrestapi.service.implementation

import id.taufiq.kotlinspringbootrestapi.data.entity.Movie
import id.taufiq.kotlinspringbootrestapi.repository.MovieRepository
import id.taufiq.kotlinspringbootrestapi.service.MovieService
import org.springframework.stereotype.Service

@Service
class MovieServiceImplementation(val repository: MovieRepository) : MovieService {
    override fun create(movie: Movie): Movie {
        return repository.save(movie)
    }

    override fun get() {
        //
    }

    override fun update() {
        //
    }

    override fun delete() {
        //
    }
}
