package id.taufiq.kotlinspringbootrestapi.data.model

data class GeneralResponse<T>(
    val message: String,
    val data: T
)
