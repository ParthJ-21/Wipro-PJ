package com.wipro.Kafkademo.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Kafkademo.entity.VehicleMovement;
import com.wipro.Kafkademo.repo.VehicleRepo;

@RestController
public class VehicleController {
	@Autowired
    private VehicleRepo repository;

    @PostMapping("/move")
    public VehicleMovement moveVehicle(@RequestBody Map<String, Object> payload) {
        VehicleMovement movement = new VehicleMovement();
        movement.setVehId(Long.valueOf(payload.get("vehId").toString()));
        movement.setLat(Double.parseDouble(payload.get("lat").toString()));
        movement.setLongitude(Double.parseDouble(payload.get("long").toString()));

        return repository.save(movement);
    }
}
