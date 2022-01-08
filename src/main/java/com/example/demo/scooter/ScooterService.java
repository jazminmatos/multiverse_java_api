package com.example.demo.scooter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScooterService {
    private final ScooterRepository scooterRepository;

    @Autowired
    public ScooterService(ScooterRepository scooterRepository) {
        this.scooterRepository = scooterRepository;
    }

    public List<Scooter> getScooters() { // ALLOWS US TO GET JSON
        return scooterRepository.findAll();
    }

    public void addNewScooter(Scooter scooter) {
        System.out.println(scooter);
    }
}