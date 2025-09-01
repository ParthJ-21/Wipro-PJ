package com.wipro.BookingMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.BookingMS.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer> {
	Booking findByPnr(String pnr);
}
