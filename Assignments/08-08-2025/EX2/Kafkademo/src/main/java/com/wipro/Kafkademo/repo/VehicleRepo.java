package com.wipro.Kafkademo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.Kafkademo.entity.VehicleMovement;

public interface VehicleRepo extends JpaRepository<VehicleMovement, Long> {
}
