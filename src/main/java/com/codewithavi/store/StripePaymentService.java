package com.codewithavi.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processpayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount:"+amount);
    }
}
