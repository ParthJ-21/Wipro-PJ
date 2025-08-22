package com.wipro.prodmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.prodmgmt.Entity.Order;
import com.wipro.prodmgmt.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderService orderService;
	@GetMapping
	List<Order> findAll()
	{
		return orderService.findAll();
	}
	@PostMapping
	void save(@RequestBody Order order)
	{
		orderService.save(order);
		
	}
}
