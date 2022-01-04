package com.example.demo.scooter;

public class Scooter {
    private Long id;
    private Long stationId; // currentChargingStation
    private Boolean isRented; // (rentStatus)

    // NO ARGUMENTS CONSTRUCTOR
    public Scooter() {
    }

    // CONSTRUCTOR W/ ID
    public Scooter(Long id, Long stationId, Boolean isRented) {
        this.id = id;
        this.stationId = stationId;
        this.isRented = isRented;
    }

    // CONSTRUCTOR WITHOUT ID
    public Scooter(Long stationId, Boolean isRented) {
        this.stationId = stationId;
        this.isRented = isRented;
    }

    // -------- GETTERS & SETTERS --------
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStationId() {
        return this.stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public Boolean isIsRented() {
        return this.isRented;
    }

    public Boolean getIsRented() {
        return this.isRented;
    }

    public void setIsRented(Boolean isRented) {
        this.isRented = isRented;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", stationId='" + getStationId() + "'" +
                ", isRented='" + isIsRented() + "'" +
                "}";
    }

    // allScooters(): class method that holds all scooters in array
    // isRented(): instance method that flips boolean property isRented
}
