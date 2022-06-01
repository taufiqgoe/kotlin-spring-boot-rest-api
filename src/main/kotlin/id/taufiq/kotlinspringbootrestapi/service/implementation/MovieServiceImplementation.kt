package id.taufiq.kotlinspringbootrestapi.service.implementation

import id.taufiq.kotlinspringbootrestapi.data.entity.Movie
import id.taufiq.kotlinspringbootrestapi.repository.MovieRepository
import id.taufiq.kotlinspringbootrestapi.service.MovieService
import id.taufiq.kotlinspringbootrestapi.util.error.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MovieServiceImplementation(val repository: MovieRepository) : MovieService {
    override fun create(movie: Movie): Movie {
        return repository.save(movie)
    }

    override fun get(id: String): Movie {
        return findByIdOrThrowException(id)
    }

    override fun update() {
        //
    }

    override fun delete() {
        //
    }

    fun findByIdOrThrowException(id: String): Movie {
        return repository.findByIdOrNull(id) ?: throw NotFoundException()
    }
}
