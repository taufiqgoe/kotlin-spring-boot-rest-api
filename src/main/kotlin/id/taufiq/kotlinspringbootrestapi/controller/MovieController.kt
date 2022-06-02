package id.taufiq.kotlinspringbootrestapi.data.controller

import id.taufiq.kotlinspringbootrestapi.data.entity.Movie
import id.taufiq.kotlinspringbootrestapi.data.model.GeneralResponse
import id.taufiq.kotlinspringbootrestapi.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/movie")
class MovieController(private val movieService: MovieService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody movie: Movie): GeneralResponse<Movie> {
        return GeneralResponse(
            message = "success",
            data = movieService.create(movie)
        )
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun get(@PathVariable("id") id: Long): GeneralResponse<Movie> {
        return GeneralResponse(
            message = "success",
            data = movieService.get(id)
        )
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun update(
        @PathVariable("id") id: Long,
        @RequestBody movie: Movie
    ): GeneralResponse<Movie> {
        return GeneralResponse(
            message = "success",
            data = movieService.update(id, movie)
        )
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun delete(@PathVariable id: Long): GeneralResponse<Long> {
        return GeneralResponse(
            message = "success",
            data = movieService.delete(id)
        )
    }
}
