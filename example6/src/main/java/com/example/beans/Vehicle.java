package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
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

    @PostConstruct
    public void intialize(){
        this.name = "Honda City";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("This bean destroyed sucessfully");
    }
}
