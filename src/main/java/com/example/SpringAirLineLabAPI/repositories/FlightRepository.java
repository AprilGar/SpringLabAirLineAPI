package com.example.SpringAirLineLabAPI.repositories;

import com.example.SpringAirLineLabAPI.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository <Flight, Long>{
}
