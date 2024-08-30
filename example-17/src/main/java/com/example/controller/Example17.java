package com.example.controller;

import com.example.aspects.MyAspect;
import com.example.config.ProjectConfig;
import com.example.service.PaymentServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example17 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        PaymentServiceImpl paymentService = context.getBean(PaymentServiceImpl.class);

        paymentService.makePayment();
    }
}
