package httpclienttest

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client('/')
interface GreetingClient {
    @Get('/demo/hello/{name}')
    String greet(String name)
}