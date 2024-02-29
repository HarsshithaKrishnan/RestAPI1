package com.example.travel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Travel")
public class Travel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long userId;
    String userName;
    String hotel;
    String adventure;
    String tickets;
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
    public String getHotel() {
        return hotel;
    }
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    public String getAdventure() {
        return adventure;
    }
    public void setAdventure(String adventure) {
        this.adventure = adventure;
    }
    public String getTickets() {
        return tickets;
    }
    public void setTickets(String tickets) {
        this.tickets = tickets;
    }
    
}