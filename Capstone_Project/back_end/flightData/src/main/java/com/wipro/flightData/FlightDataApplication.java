package com.wipro.flightData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class FlightDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightDataApplication.class, args);
	}

}
