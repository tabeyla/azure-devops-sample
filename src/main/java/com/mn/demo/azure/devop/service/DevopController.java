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
        return "Hello devops with Azure Container Registry for MS";
    }
}
