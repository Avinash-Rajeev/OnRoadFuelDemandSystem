







package com.example.fueldemand.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.fueldemand.model.Booking;
import com.example.fueldemand.model.User;
@Service
public class FuelService {
    private Map<String, User> users = new HashMap<>();
    private List<Booking> bookings = new ArrayList<>();
    public FuelService() {
        users.put("avinash", new User("avinash", "1234", "Chennai"));
    }
    public boolean login(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }
    public Booking createBooking(String username, String serviceType, String location) {
        Booking b = new Booking(username, serviceType, location);
        bookings.add(b);
        return b;
    }
    public List<Booking> getHistory(String username) {
        List<Booking> history = new ArrayList<>();
        for (Booking b : bookings) {
            if (b.getUsername().equals(username)) history.add(b);
        }
        return history;
    }
    public List<String> getEmergencyServices() {
        return Arrays.asList("Ambulance - 108", "Traffic Police - 100", "Crane Service - 1800-CRANE", "Nearest Petrol Bunk");
    }
}