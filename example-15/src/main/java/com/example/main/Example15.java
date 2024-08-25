package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example15 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person1 = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);

        System.out.println(person1.hashCode()+" "+person2.hashCode());

        if(person1 == person2){
            System.out.println("This Bean is Singleton scope bean");
        }else{
            System.out.println("This bean is Prototype scope bean");
        }
    }
}
