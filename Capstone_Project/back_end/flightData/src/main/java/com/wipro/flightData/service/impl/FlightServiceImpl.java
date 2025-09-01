package com.wipro.flightData.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.flightData.entity.Flight;
import com.wipro.flightData.repo.FlightRepo;
import com.wipro.flightData.service.FlightService;
@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightRepo repo;

	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return repo.save(flight);
		}

	@Override
	public List<Flight> searchFlights(String source, String destination, String date) {
		// TODO Auto-generated method stub
		return repo.findBySourceAndDestinationAndDate(source, destination, date);	
        }
	@Override
	public Flight getFlightById(int id){
	    return repo.findById(id)
	               .orElseThrow(() -> new RuntimeException("Flight not found: " + id));
	}


}
