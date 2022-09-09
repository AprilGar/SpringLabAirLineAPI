package com.example.SpringAirLineLabAPI.repositories;

import com.example.SpringAirLineLabAPI.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository <Passenger, Long> {
}
