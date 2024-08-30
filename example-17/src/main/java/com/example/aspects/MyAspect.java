package com.example.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("execution(* com.example.service.PaymentServiceImpl.makePayment())")
    public void printBefore(){
        System.out.println("Payment Started...");
    }

    @After("execution(* com.example.service.PaymentServiceImpl.makePayment())")
    public void printAfter(){
        System.out.println("Payment done....");
    }

}
