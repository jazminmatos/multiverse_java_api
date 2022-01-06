package com.example.demo.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service // same as @Component, but better for readability
// allows it to be defined as a Spring Bean
// so that we can pass it into userController using
// dependency injection
public class UserService {
    public List<User> getUsers() { // ALLOWS US TO GET JSON
        return List.of(
                new User(
                        1L,
                        "Jazmin",
                        28,
                        123456789101112L,
                        1L,
                        true,
                        true));
    }
}
