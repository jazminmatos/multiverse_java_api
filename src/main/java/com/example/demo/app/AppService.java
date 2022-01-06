package com.example.demo.app;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    public List<App> getApps() { // ALLOWS US TO GET JSON
        return List.of(
                new App(
                        1L,
                        "Scooter App",
                        null,
                        null));
    }
}
