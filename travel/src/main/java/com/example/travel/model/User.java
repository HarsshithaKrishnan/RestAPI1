package com.example.travel.model;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long userId;
    String userName;
    String emailAddress;
    Long travelId;
    String gender;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="users_id")
    List<Travel>travel= new ArrayList<>();
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Long getTravelId() {
        return travelId;
    }
    public void setTravelId(Long travelId) {
        this.travelId = travelId;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<Travel> getTravels() {
        return travel;
    }
    public void setTravel(List<Travel> travel)
    {
        this.travel=travel;
    }
    
}