package com.wipro.flightData.service;

import java.util.List;

import com.wipro.flightData.entity.Flight;

public interface FlightService {
	Flight addFlight(Flight flight);
    List<Flight> searchFlights(String source, String destination, String date);
    Flight getFlightById(int Id);
}
