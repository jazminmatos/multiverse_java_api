package com.example.demo.station;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/station")

public class StationController {
    private final StationService stationService;

    @Autowired // pass in Service class instance using dependency injection
    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping
    public List<Station> getStations() { // ALLOWS US TO GET JSON
        return stationService.getStations();
    }

    @PostMapping
    public void registerNewStation(@RequestBody Station station) {
        stationService.addNewStation(station);
    }
}
