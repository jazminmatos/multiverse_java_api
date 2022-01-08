package com.example.demo.user;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner userCommandLineRunner(UserRepository repository) {
        // remove id b/c it will be generated for us by the database
        return args -> {
            User jazmin = new User("Jazmin", 28, 123456789101112L, 1L, true, true);
            User tony = new User("Tony", 28, 123456789101112L, 2L, true, true);

            // save onto datbase
            repository.saveAll(
                    List.of(jazmin, tony));
        };

    }
}
