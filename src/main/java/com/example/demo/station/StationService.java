package com.example.demo.station;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StationService {
    public List<Station> getStations() { // ALLOWS US TO GET JSON
        return List.of(
                new Station(
                        1L,
                        "ATL Station",
                        null));
    }
}
