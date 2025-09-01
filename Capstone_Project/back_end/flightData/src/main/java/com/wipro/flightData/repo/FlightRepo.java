package com.wipro.flightData.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.flightData.entity.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceAndDestinationAndDate(String source, String destination, String date);
    Optional<Flight> findById(int Id);
}
