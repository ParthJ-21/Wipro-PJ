package com.wipro.prodmgmt.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.prodmgmt.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
