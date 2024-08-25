package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
    public  EagerLoader(){
        System.out.println("Loading eagarly");
    }
}
