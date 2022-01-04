package com.example.demo.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController // ALLOWS US TO MAKE THIS CLASS IN CHARGE OF RESTFUL ENDPOINTS
@RequestMapping(path = "api/v1/user")

public class UserController {
    @GetMapping
    public List<User> getUser() { // ALLOWS US TO GET JSON
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
