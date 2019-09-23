package httpclienttest;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/demo")
public class DemoController {

    @Get("/hello/{name}")
    public String hello(String name) {
        return "Hello " + name;
    }
}