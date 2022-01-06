package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // Hibernate
@Table // For table in database
public class User {
    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")

    private Long id;
    private String name;
    private Integer age;
    private Long payment; // (payment card)
    private Long scooterId; // user has one scooter (rentedScooter)
    private Long appId; // user has one app
    private Boolean hasApp;
    private Boolean hasRegistered;

    // NO ARGUMENTS CONSTRUCTOR
    public User() {
    }

    // CONSTRUCTOR WITH ALL FIELDS (w/ id)
    // Long appId: Removed b/c constructor can only have 7 parameters
    // appId can be set, but user CANNOT be initialized w/ appId
    public User(Long id,
            String name,
            Integer age,
            Long payment,
            Long scooterId,
            Boolean hasApp,
            Boolean hasRegistered) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.payment = payment;
        this.scooterId = scooterId;
        this.hasApp = hasApp;
        this.hasRegistered = hasRegistered;
    }

    // CONSTRUCTOR WITHOUT ID
    public User(String name,
            Integer age,
            Long payment,
            Long scooterId,
            Boolean hasApp,
            Boolean hasRegistered) {
        this.name = name;
        this.age = age;
        this.payment = payment;
        this.scooterId = scooterId;
        this.hasApp = hasApp;
        this.hasRegistered = hasRegistered;
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

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPayment() {
        return this.payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public Long getScooterId() {
        return this.scooterId;
    }

    public void setScooterId(Long scooterId) {
        this.scooterId = scooterId;
    }

    public Long getAppId() {
        return this.appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Boolean isHasApp() {
        return this.hasApp;
    }

    public Boolean getHasApp() {
        return this.hasApp;
    }

    public void setHasApp(Boolean hasApp) {
        this.hasApp = hasApp;
    }

    public Boolean isHasRegistered() {
        return this.hasRegistered;
    }

    public Boolean getHasRegistered() {
        return this.hasRegistered;
    }

    public void setHasRegistered(Boolean hasRegistered) {
        this.hasRegistered = hasRegistered;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", payment='" + getPayment() + "'" +
                ", scooterId='" + getScooterId() + "'" +
                ", appId='" + getAppId() + "'" +
                ", hasApp='" + isHasApp() + "'" +
                ", hasRegistered='" + isHasRegistered() + "'" +
                "}";
    }

    // allUsers(): class method that stores all users in array

    // downloadApp(app)
    // registerUser(cardInfo, age)
    // rentScooter(scooter)
    // payRental()
}
