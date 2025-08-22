package com.wipro.prodmgmt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	int prodId;
	
	@Column
	String prodName;
	
	@Column
	String orderDate;
	
	@Column
	int qtyPurchased;
}
