package com.wipro.prodmgmt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.prodmgmt.Entity.Order;
import com.wipro.prodmgmt.Entity.Product;
import com.wipro.prodmgmt.rep.ProductRepository;
import com.wipro.prodmgmt.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository repo;
	@Override
	public List<Product> findAll() {
		return repo.findAll();
	}

	@Override
	public Product findById(int id) {
		Optional<Product> userOpt= repo.findById(id);
		if(userOpt.isPresent())
		{
			return userOpt.get();
		}
		return null;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		repo.save(product);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
}
