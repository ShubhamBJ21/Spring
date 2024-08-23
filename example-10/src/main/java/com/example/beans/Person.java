package com.example.beans;

public class Person {
    public Person(){
        System.out.println("Person bean is created by spring context");
    }

    private String name;
    private Vehicle vehicle;

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Vehicle getVehicle(){
        return  vehicle;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
}
