package id.taufiq.kotlinspringbootrestapi.repository

import id.taufiq.kotlinspringbootrestapi.data.entity.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface MovieRepository : JpaRepository<Movie, String> {

}