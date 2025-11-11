package com.example.fueldemand.model;

import java.time.LocalDateTime;

public class Booking {
    private String username;
    private String serviceType;
    private String location;
    private LocalDateTime dateTime;

    public Booking() {}

    public Booking(String username, String serviceType, String location) {
        this.username = username;
        this.serviceType = serviceType;
        this.location = location;
        this.dateTime = LocalDateTime.now();
    }

    public String getUsername() { return username; }
    public String getServiceType() { return serviceType; }
    public String getLocation() { return location; }
    public LocalDateTime getDateTime() { return dateTime; }
}