package com.judgesstats.endpoints;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/judges")
public class JudgesWorld {
    @Get("/world")
    public String judgesHello() {
        return "Hello from Judges Stats!";
    }
}
