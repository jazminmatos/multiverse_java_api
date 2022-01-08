package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // same as @Component, but better for readability
// allows it to be defined as a Spring Bean
// so that we can pass it into userController using
// dependency injection
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() { // ALLOWS US TO GET JSON
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userOptional = userRepository.findUserByName(user.getName());

        if (userOptional.isPresent()) {
            throw new IllegalStateException("Name is taken");
        }
        userRepository.save(user);
    }
}