package com.example.demo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/app")

public class AppController {
    private final AppService appService;

    @Autowired // pass in Service class instance using dependency injection
    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping
    public List<App> getApps() { // ALLOWS US TO GET JSON
        return appService.getApps();
    }
}
