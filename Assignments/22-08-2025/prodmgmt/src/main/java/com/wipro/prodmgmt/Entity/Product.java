package com.wipro.prodmgmt.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String category;
	
	@Column
	int price;
	
	@Column
	int qty;
}
