package com.wipro.PaymentMS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.PaymentMS.entity.Payment;
import com.wipro.PaymentMS.repo.PaymentRepo;

@Service
public class BToPConsumer {
	@Autowired
	PaymentRepo paymentRepo;
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	@KafkaListener(topics="BToP",groupId="payment_service")
	public void receiveUpiPayment(Payment payment) {
		System.out.println("---Message Received ---"+payment);
		payment.setPaymentStatus("Confirmed");
		paymentRepo.save(payment);
		kafkaTemplate.send("PToB",payment);
	}
}
	
