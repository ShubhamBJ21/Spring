package com.example.beans;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle Bean Created by Spring");
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Vehicle name is: "+name;
    }
}
