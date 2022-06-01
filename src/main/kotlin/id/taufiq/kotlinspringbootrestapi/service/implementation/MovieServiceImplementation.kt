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

    override fun get(id: Long): Movie {
        return findByIdOrThrowException(id)
    }

    override fun update(id: Long, movie: Movie): Movie {
        val currentMovie = findByIdOrThrowException(id)

        currentMovie.title = movie.title
        currentMovie.description = movie.description
        currentMovie.genre = movie.genre

        return repository.save(currentMovie)
    }

    override fun delete(id: Long): Long {
        if (!repository.existsById(id)) {
            throw IllegalArgumentException("Invalid Id:$id")
        }
        repository.deleteById(id)
        return id
    }

    fun findByIdOrThrowException(id: Long): Movie {
        return repository.findById(id)
            .orElseThrow { IllegalArgumentException("Invalid Id:$id") }
    }
}
