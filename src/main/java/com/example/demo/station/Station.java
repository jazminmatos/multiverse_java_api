package com.example.demo.station;

public class Station {
    private Long id;
    private String name;
    private String[] scooters;

    // NO ARGUMENTS CONSTRUCTOR
    public Station() {
    }

    // CONSTRUCTOR W/ ID
    public Station(Long id, String name, String[] scooters) {
        this.id = id;
        this.name = name;
        this.scooters = scooters;
    }

    // CONSTRUCTOR WITHOUT ID OR SCOOTERS
    public Station(String name, String[] scooters) {
        this.name = name;
        this.scooters = scooters;
    }

    // -------- GETTERS & SETTERS --------

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getScooters() {
        return this.scooters;
    }

    public void setScooters(String[] scooters) {
        this.scooters = scooters;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", scooters='" + getScooters() + "'" +
                "}";
    }

    // allChargingStations(): class methods that hold all stations in array

    // addScooter(scooter)
    // removeScooter(scooter)
}
