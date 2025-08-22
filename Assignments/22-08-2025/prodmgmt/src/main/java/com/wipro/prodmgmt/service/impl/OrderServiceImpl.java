package com.wipro.prodmgmt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.prodmgmt.Entity.Order;
import com.wipro.prodmgmt.rep.OrderRepository;
import com.wipro.prodmgmt.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	OrderRepository repo;

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void save(Order order) {
		repo.save(order);

	}

}
