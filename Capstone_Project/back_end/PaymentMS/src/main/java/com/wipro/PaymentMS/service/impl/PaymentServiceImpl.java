package com.wipro.PaymentMS.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.PaymentMS.entity.Payment;
import com.wipro.PaymentMS.repo.PaymentRepo;
import com.wipro.PaymentMS.service.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepo repo;
	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public Payment findById(long id) {
		// TODO Auto-generated method stub
		Optional<Payment> paymentOpt= repo.findById(id);
		if(paymentOpt.isPresent())
		{
			return paymentOpt.get();
		}
		return null;
	}
	
	@Override
	public Payment save(Payment payment) {
		// TODO Auto-generated method stub
		return payment;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	

}
