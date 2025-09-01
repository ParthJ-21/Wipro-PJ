package com.wipro.PaymentMS.service;

import java.util.List;

import com.wipro.PaymentMS.entity.Payment;

public interface PaymentService {
	List<Payment> findAll();
	Payment findById(long id);
	Payment save(Payment payment);
	void deleteById(long id);
}
