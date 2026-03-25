package com.djstats.landing;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class LandingController {

    @Get("/")
    public String index() {
        return "index";
    }
}
