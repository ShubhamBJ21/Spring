package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class example5 {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");

        Vehicle vechicle1 = context.getBean(Vehicle.class);
        System.out.println("Vechicle name from spring context: "+vechicle1.getName());

    }
}
