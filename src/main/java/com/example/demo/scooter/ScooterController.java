package com.example.demo.scooter;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/scooter")

public class ScooterController {
    private final ScooterService scooterService;

    @Autowired // pass in Service class instance using dependency injection
    public ScooterController(ScooterService scooterService) {
        this.scooterService = scooterService;
    }

    @GetMapping
    public List<Scooter> getScooters() { // ALLOWS US TO GET JSON
        return scooterService.getScooters();
    }

    @PostMapping
    public void registerNewScooter(@RequestBody Scooter scooter) {
        scooterService.addNewScooter(scooter);
    }
}
