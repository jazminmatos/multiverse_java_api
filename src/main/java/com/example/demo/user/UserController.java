package com.example.demo.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController // ALLOWS US TO MAKE THIS CLASS IN CHARGE OF RESTFUL ENDPOINTS
@RequestMapping(path = "api/v1/user")

public class UserController {
    private final UserService userService;

    @Autowired // pass in Service class instance using dependency injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser() { // ALLOWS US TO GET JSON
        return userService.getUsers();
    }
}
