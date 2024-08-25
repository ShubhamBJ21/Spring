package com.example.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Person {
    private String name = "Shubham";

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }
}
