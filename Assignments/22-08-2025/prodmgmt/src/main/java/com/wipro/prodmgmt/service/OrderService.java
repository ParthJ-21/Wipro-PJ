package com.wipro.prodmgmt.service;

import java.util.List;

import com.wipro.prodmgmt.Entity.Order;


public interface OrderService {
	List<Order> findAll();
	void save(Order product);
}
