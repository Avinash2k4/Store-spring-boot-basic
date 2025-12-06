package com.codewithavi.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(StoreApplication.class, args);//returns the obj of type application context.app context in IOC,it's storage for the obj.so we can store the result.
        var orderService=context.getBean(OrderService.class);//we make spring handle the create the obj and depedencies
        /*if we run this then it show the error "NoSuchBeanDefinitionException: No qualifying bean of type 'com.codewithavi.store.OrderService' available"
         that means the spring doesn't know how to create the insatnce of orderservice

         so resolve this issue we have two different methods:

         configuring beans:
         1.using annotation
         2.using code
         */

        //var orderService=new OrderService(new PayPalPaymentService());//to process this we didn't have to modify the orderservice we extend our application instead of modifying existence onces.So this is called "open closed principle"
        orderService.placeorder();
    }

}
