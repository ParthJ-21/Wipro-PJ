package com.wipro.prodmgmt.service;

import java.util.List;

import com.wipro.prodmgmt.Entity.Product;

public interface ProductService {
	List<Product> findAll();
	Product findById(int id);
	void save(Product product);
	void deleteById(int id);
}
