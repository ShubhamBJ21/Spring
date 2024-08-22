package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mercedes Benz");
        System.out.println("Vechicle name from non-spring context: "+ vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);

        System.out.println("Vechicle name from spring context: "+ vehicle1.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from spring context: "+hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from spring context: "+num);
    }
}
