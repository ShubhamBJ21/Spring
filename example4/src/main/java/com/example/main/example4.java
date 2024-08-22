package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vechicle name from spring context: "+ vehicle1.getName());

//        Vechicle vechicle2 = context.getBean("mercedesVechicle", Vechicle.class);
//        System.out.println("Vechicle name from spring context: "+vechicle2.getName());
//
//        Vechicle vechicle3 = context.getBean("bugattiVechicle", Vechicle.class);
//        System.out.println("Vechicle name from spring context: "+vechicle3.getName());

    }
}
