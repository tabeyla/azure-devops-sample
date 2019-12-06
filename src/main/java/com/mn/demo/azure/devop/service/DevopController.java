package com.mn.demo.azure.devop.service;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class DevopController {

    /**
     * Add a controller
     * @return
     */
    @Get("/hello")
    public String hello() {
        return "hello azure devops to a new docker registry again for karan";
    }
}
