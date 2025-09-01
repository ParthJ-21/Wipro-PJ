package com.wipro.BookingMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class FlightClient {
	@Autowired
    private RestTemplate restTemplate;
	public FlightClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @CircuitBreaker(name = "flightService", fallbackMethod = "fallbackFlights")
    public String getFlights(String src, String dst, String date) {
        String url = "http://flightData/flights?src=" + src + "&dst=" + dst + "&date=" + date;
        return restTemplate.getForObject(url, String.class);
    }

    public String fallbackFlights(String src, String dst, String date, Throwable t) {
        return "?!?! Flight service is unavailable, please try later.";
    }
}
