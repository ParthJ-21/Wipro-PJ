package com.wipro.BookingMS.dto;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

 
@Data 
public class Payment {

    private Long id;
    private int bookingId;
    private double amount;
    private String status;
    
}
