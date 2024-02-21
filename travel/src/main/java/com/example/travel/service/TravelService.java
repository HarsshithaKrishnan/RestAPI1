package com.example.travel.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travel.model.Travel;
import com.example.travel.repo.TravelRepo;

@Service
public class TravelService {
@Autowired
TravelRepo travelRepo;
public Travel addTravel(Travel travel)
{
    return travelRepo.save(travel);
}

public List<Travel> getTravel()
{
    return travelRepo.findAll();
}
public Optional<Travel> getTravelById(Long userId)
{
    return travelRepo.findById(userId);
}
public void deluser(Long userId)
{
    travelRepo.deleteById(userId);
}
public Travel editTravel(Long userId,Travel travel)
{
    Travel travelAvail=travelRepo.findById(userId).orElse(null);
    if(travelAvail!=null)
    {
        travelAvail.setUserName(travel.getUserName());
        travelAvail.setEmailAddress(travel.getEmailAddress());
        travelAvail.setPassword(travel.getPassword());
        travelAvail.setConfirmPassword(travel.getConfirmPassword());
        return travelRepo.saveAndFlush(travelAvail);
    }
    else
    {
        return null;
    }
}



}