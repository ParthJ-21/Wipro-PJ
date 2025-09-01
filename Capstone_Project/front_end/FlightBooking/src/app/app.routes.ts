import { Routes } from '@angular/router';
import { Home } from '../Components/home/home';
import { Booking } from '../Components/booking-list/booking';
import { Payment } from '../Components/payment/payment';
import { Formcomp } from '../Components/formcomp/formcomp';
import { SummaryComp } from '../Components/summary-comp/summary-comp';
import { SuccessComp } from '../Components/success-comp/success-comp';

export const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' }, // default route
  { path: 'home', component: Home },
  { path: 'flights', component: Booking },
  { path: 'payment/:id', component: Payment },
  { path: 'passenger', component: Formcomp },
  { path: 'summary', component: SummaryComp },
  { path: 'success', component: SuccessComp }
];
