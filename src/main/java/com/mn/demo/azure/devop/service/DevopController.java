package com.mn.demo.azure.devop.service;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class DevopController {

    @Get("/hello")
    public String hello() {
        return "hello";
    }
}
