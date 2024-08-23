package com.example.beans;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle bean is created by spring context");
    }

    private String name;

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Vehicle name is: "+name;
    }
}
