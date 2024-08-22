package com.example.beans;

public class Vehicle {

    private String name;

    public Vehicle(){
        //no argument constructor
    }

    public Vehicle(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
