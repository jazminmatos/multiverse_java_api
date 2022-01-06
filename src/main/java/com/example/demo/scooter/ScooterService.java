package com.example.demo.scooter;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ScooterService {
    public List<Scooter> getScooters() { // ALLOWS US TO GET JSON
        return List.of(
                new Scooter(
                        1L,
                        1L,
                        true));
    }
}
