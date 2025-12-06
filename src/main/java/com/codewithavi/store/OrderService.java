package com.codewithavi.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service//which tells the spring to manage the obj of orderservice
public class OrderService {


    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    /*
    public OrderService(){}

    //@Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    if we didn't use autowired then the default constructor is being processed so it shows the error of
    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.codewithavi.store.PaymentService.processpayment(double)" because "this.paymentService" is null"

    -->if we use autowired it directly direct to the constructor with the argument. so it didn't shows the error tof the nullpointer exception.
    -->if we use the constructor with the different arguments and also didn't use the autowired then the class shown the error of "Class doesn't contain a matching constructor for autowiring"
       it shows the normal exception "BeanCreationException: Error creating bean with name 'orderService' defined in file "
    */

    public void placeorder(){
        paymentService.processpayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
