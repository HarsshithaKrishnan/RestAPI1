package com.example.travel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.travel.model.Travel;

@Repository
public interface TravelRepo extends JpaRepository<Travel,Long>{
    
}