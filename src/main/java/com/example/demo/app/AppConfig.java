package com.example.demo.app;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    CommandLineRunner appCommandLineRunner(AppRepository repository) {
        return args -> {
            App scooterApp = new App("Scooter App", null, null);

            repository.saveAll(List.of(scooterApp));
        };
    }
}
