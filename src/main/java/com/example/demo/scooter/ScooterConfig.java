package com.example.demo.scooter;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScooterConfig {
    @Bean
    CommandLineRunner scooterCommandLineRunner(ScooterRepository repository) {
        return args -> {
            Scooter one = new Scooter(1L, true);
            Scooter two = new Scooter(1L, true);
            Scooter three = new Scooter(2L, true);
            Scooter four = new Scooter(2L, true);

            repository.saveAll(
                    List.of(one, two, three, four));
        };
    }
}
