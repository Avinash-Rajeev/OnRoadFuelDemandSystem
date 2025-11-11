package com.example.fueldemand.controller;

import com.example.fueldemand.model.Booking;
import com.example.fueldemand.service.FuelService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FuelController {
    private final FuelService service;

    public FuelController(FuelService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return service.login(username, password) ? "Login Successful" : "Invalid Credentials";
    }

    @PostMapping("/book")
    public Booking bookFuel(@RequestParam String username, @RequestParam String serviceType, @RequestParam String location) {
        return service.createBooking(username, serviceType, location);
    }

    @GetMapping("/history/{username}")
    public List<Booking> getHistory(@PathVariable String username) {
        return service.getHistory(username);
    }

    @GetMapping("/emergency")
    public List<String> getEmergencyServices() {
        return service.getEmergencyServices();
    }
}