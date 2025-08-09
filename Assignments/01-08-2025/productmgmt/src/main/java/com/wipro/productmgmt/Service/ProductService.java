package com.wipro.productmgmt.Service;

import java.util.List;

import com.wipro.productmgmt.Entity.Prod;

public interface ProductService {
	void save(Prod Product);
	List<Prod> findAll();
	Prod findById(int id);
	void deleteById(int id);
}
