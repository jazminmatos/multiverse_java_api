package com.example.demo.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    private final AppRepository appRepository;

    @Autowired
    public AppService(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    public List<App> getApps() { // ALLOWS US TO GET JSON
        return appRepository.findAll();
    }

    public void addNewApp(App app) {
        System.out.println(app);
    }
}