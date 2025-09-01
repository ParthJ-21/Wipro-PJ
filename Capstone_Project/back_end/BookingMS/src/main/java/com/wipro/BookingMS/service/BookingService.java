package com.wipro.BookingMS.service;

import com.wipro.BookingMS.dto.Payment;
import com.wipro.BookingMS.entity.Booking;


public interface BookingService {
	Booking createBooking(Booking booking);
    Booking getBookingByPnr(String pnr);
    void pay(Payment payment);
}
