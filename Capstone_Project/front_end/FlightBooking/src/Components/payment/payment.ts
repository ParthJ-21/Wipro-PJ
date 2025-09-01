import { Component, OnInit } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { PaymentService } from '../../Service/payment-service';
import { BookingService } from '../../Service/booking-service';
import { ActivatedRoute, Router } from '@angular/router';
import { IBooking } from '../../Interface/ibooking';
import { IPayment } from '../../Interface/ipayment';
import { CurrencyPipe } from '@angular/common';
import { IFlight } from '../../Interface/iflight';

@Component({
  selector: 'app-payment',
  imports: [FormsModule, CurrencyPipe],
  templateUrl: './payment.html',
  styleUrl: './payment.css'
})
export class Payment{
  booking!: IBooking;
  flight!: IFlight;
  payment:IPayment ={
  bookingId: 0,
  amount: 0,
  modeOfPayment: '',
  accountNumber: '',
  cvv: 0
  };


   constructor(private router : Router,
    private activatedRoute: ActivatedRoute,
    private bookingService: BookingService

  ){
    const nav = this.router.getCurrentNavigation();
        const state = nav?.extras.state as { booking: IBooking, flight: IFlight  };
        if (state) {
        this.booking = state.booking;
        this.flight = state.flight;
      }
  }


  ngOnInit() {
    this.payment.amount = this.flight.price;
    this.payment.bookingId = this.flight.id;
    console.log("this is booking id = " + this.payment.bookingId);
    console.log("this is total price = " + this.payment.amount);
  }

  pay() {
    let payment: IPayment = {
      bookingId: this.payment.bookingId,
      amount: this.payment.amount,
      modeOfPayment: this.payment.modeOfPayment,
      accountNumber: this.payment.accountNumber,
      cvv: this.payment.cvv
    };

    this.bookingService.pay(payment).subscribe((data) => {
      console.log('Payment Response:', data);
      this.router.navigate(['/success']);

        this.bookingService.downloadTicket(data.bookingId).subscribe((pdf: Blob) => {
          const url = window.URL.createObjectURL(pdf);
          const a = document.createElement('a');
          a.href = url;
          a.download = `ticket_${data.bookingId}.pdf`;
          a.click();
        });
    });
  }
}