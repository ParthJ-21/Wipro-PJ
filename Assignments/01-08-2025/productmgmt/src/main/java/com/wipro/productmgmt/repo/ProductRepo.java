package com.wipro.productmgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.productmgmt.Entity.Prod;
@Repository
public interface ProductRepo extends JpaRepository<Prod, Integer> {

}
