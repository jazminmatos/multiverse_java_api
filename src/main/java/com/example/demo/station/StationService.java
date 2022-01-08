package com.example.demo.station;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService {
    private final StationRepository stationRepository;

    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public List<Station> getStations() { // ALLOWS US TO GET JSON
        return stationRepository.findAll();
    }

    public void addNewStation(Station station) {
        System.out.println(station);
    }
}