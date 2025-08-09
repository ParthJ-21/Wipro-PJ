package com.wipro.notificatio_ms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="order_data")
@Data
public class Notify {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Id;
	@Column(name="user_name")
	String username;
	@Column(name="user_password")
    String password;
	@Column(name="user_adress")
    String address;
}