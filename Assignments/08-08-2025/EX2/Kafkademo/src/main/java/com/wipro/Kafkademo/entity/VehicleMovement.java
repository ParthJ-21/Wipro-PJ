package com.wipro.Kafkademo.entity;
import jakarta.persistence.*;


import lombok.Data;
@Entity
@Data
@Table(name = "vehicle_movement")

public class VehicleMovement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private Long vehId;
    private double lat;
    private double longitude;

}
