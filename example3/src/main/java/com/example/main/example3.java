package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean("audiVechicle", Vehicle.class);
        System.out.println("Vechicle name from spring context: "+ vehicle1.getName());

        Vehicle vehicle2 = context.getBean("mercedesVechicle", Vehicle.class);
        System.out.println("Vechicle name from spring context: "+ vehicle2.getName());

        Vehicle vehicle3 = context.getBean("bugattiVechicle", Vehicle.class);
        System.out.println("Vechicle name from spring context: "+ vehicle3.getName());

    }
}
