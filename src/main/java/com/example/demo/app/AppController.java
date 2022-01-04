package com.example.demo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/app")

public class AppController {
    @GetMapping
    public List<App> getApp() { // ALLOWS US TO GET JSON
        return List.of(
                new App(
                        1L,
                        "Scooter App",
                        null,
                        null));
    }
}
