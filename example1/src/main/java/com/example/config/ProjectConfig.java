package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vechicle(){
        var vech = new Vehicle();
        vech.setName("Audi 8");
        return  vech;
    }

    @Bean
    String hello(){
        return "Hello Spring";
    }

    @Bean
    Integer num(){
        return 10;
    }
}
