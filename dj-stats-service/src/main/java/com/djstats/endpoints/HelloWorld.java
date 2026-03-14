package com.djstats.endpoints;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWorld {
    @Get("/world")
    public String hello() {
        return "Hello, World!";
    }
}
