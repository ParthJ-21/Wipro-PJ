package com.wipro.prodmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.prodmgmt.Entity.Product;
import com.wipro.prodmgmt.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService prodService;
	
	@GetMapping
	List<Product> findAll()
	{
		return prodService.findAll();
	}
	@GetMapping("/{id}")
	Product findById(@PathVariable int id)
	{
		return prodService.findById(id);
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		prodService.deleteById(id);
	}
	@PostMapping
	void save(@RequestBody Product prod)
	{
		prodService.save(prod);
		
	}
	
	@PutMapping
	void update(@RequestBody Product prod)
	{
		prodService.save(prod);
		
	}
}
