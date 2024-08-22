package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vechicle1(){
        var vech = new Vehicle();
        vech.setName("Audi 8");
        return  vech;
    }

    @Bean
    Vehicle vechicle2(){
        var vech = new Vehicle();
        vech.setName("Mercedes Benz");
        return  vech;
    }

    @Bean
    Vehicle vechicle3(){
        var vech = new Vehicle();
        vech.setName("Bugatti");
        return vech;
    }
}
