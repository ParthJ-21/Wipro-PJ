package com.wipro.BookingMS.service.impl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.BookingMS.dto.Payment;
import com.wipro.BookingMS.entity.Booking;
import com.wipro.BookingMS.repo.BookingRepo;
@Service
public class PToBConsumer {
	@Autowired
	BookingRepo repo;
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	@KafkaListener(topics= "PToB",groupId="payment_service")
	public void receiveUpiPayment(Payment payment) {
		System.out.println("---Message Received ---"+payment);
		Optional<Booking> book = repo.findById((payment.getBookingId()));
		if(book.isPresent()) {
			Booking booking = book.get();
			booking.setStatus(payment.getStatus());
			repo.save(booking);
					
		}
		
			
		
		
		
	}
	

}
