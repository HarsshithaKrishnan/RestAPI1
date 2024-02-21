package com.example.travel.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.travel.model.Travel;
import com.example.travel.service.TravelService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class TravelController {
@Autowired
TravelService travelService;
    @PostMapping("/addtravel")
    public Travel addTravel(@RequestBody Travel travel) {
        
        return travelService.addTravel(travel);
    }
    
    @GetMapping("/gettravel")
    public List<Travel> getTravel() {
        return travelService.getTravel();
    }
    
    @GetMapping("/gettravel/{userId}")
    public Optional<Travel> getTravelById(@PathVariable Long userId) {
        return travelService.getTravelById(userId);
    }
    @PutMapping("/edittravel/{userId}")
    public Travel editTravel(@PathVariable Long userId,@RequestBody Travel travel)
    {
        return travelService.editTravel(userId, travel);
    }
    @DeleteMapping("/deltravel/{userId}")
    public void deluser(@PathVariable Long userId)
    {
        travelService.deluser(userId);
    }
}