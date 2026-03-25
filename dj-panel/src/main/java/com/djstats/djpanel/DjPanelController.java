package com.djstats.djpanel;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class DjPanelController {

    @Get("/djs")
    public String djs() {
        return "djpanel";
    }
}
