package id.taufiq.kotlinspringbootrestapi.entity

import org.hibernate.Hibernate
import javax.persistence.*

@Entity
@Table(name = "movie")
data class Movie(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: String,

    val title: String,

    val description: String,

    @ElementCollection
    @CollectionTable(name = "genre")
    @Column(name = "genre", length = 25)
    val genre: MutableList<String> = mutableListOf()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Movie

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , title = $title , description = $description , genre = $genre )"
    }
}