package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example5 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vechicle name from spring context: "+ vehicle1.getName());

    }
}
