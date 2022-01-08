package com.example.demo.station;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StationConfig {
    @Bean
    CommandLineRunner stationCommandLineRunner(StationRepository repository) {
        return args -> {
            Station atl = new Station("ATL Station", null);
            Station nyc = new Station("NYC Station", null);

            repository.saveAll(
                    List.of(atl, nyc));
        };
    }
}