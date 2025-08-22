package com.wipro.prodmgmt.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.prodmgmt.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
