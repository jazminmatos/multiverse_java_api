package com.example.demo.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // Hibernate
@Table // For table in database

public class App {
    @Id
    @SequenceGenerator(name = "app_sequence", sequenceName = "app_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_sequence")

    private Long id;
    private String name;
    private String[] users;
    private String[] stations;

    // NO ARGUMENTS CONSTRUCTOR
    public App() {
    }

    // CONSTRUCTOR W/ ID
    public App(Long id, String name, String[] users, String[] stations) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.stations = stations;
    }

    // CONSTRUCTOR WITHOUT ID
    public App(String name, String[] users, String[] stations) {
        this.name = name;
        this.users = users;
        this.stations = stations;
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

    public String[] getUsers() {
        return this.users;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

    public String[] getStations() {
        return this.stations;
    }

    public void setStations(String[] stations) {
        this.stations = stations;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", users='" + getUsers() + "'" +
                ", stations='" + getStations() + "'" +
                "}";
    }

    // addUser(user)
    // addStation(station)
    // findStationAndScooter(user)
    // collectPayment(user)
}
