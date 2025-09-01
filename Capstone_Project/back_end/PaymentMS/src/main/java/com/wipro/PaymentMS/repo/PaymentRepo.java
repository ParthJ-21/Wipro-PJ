package com.wipro.PaymentMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.PaymentMS.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long> {

}
