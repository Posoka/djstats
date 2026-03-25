package com.djstats.judgepanel;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class JudgePanelController {

    @Get("/judges")
    public String judges() {
        return "judgepanel";
    }
}
