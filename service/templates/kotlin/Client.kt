${packageName ? 'package ' + packageName : '' }

import io.micronaut.http.client.Client
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Client("${propertyName}")
interface ${className} {

    @Get("/")
    fun index(): HttpStatus
}