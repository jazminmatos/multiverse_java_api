package com.example.demo.scooter;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/scooter")

public class ScooterController {
    @GetMapping
    public List<Scooter> getScooter() { // ALLOWS US TO GET JSON
        return List.of(
                new Scooter(
                        1L,
                        1L,
                        true));
    }
}
