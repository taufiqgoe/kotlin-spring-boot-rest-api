package id.taufiq.kotlinspringbootrestapi.data.controller

import id.taufiq.kotlinspringbootrestapi.data.model.GeneralResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@RestControllerAdvice
class ErrorController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = [IllegalArgumentException::class])
    fun badRequest(exception: java.lang.IllegalArgumentException): GeneralResponse<String> {
        return GeneralResponse(
            message = "${exception.message}",
            data = null
        )
    }


}