package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(value="audiVechicle")
    Vehicle vechicle1(){
        var vech = new Vehicle();
        vech.setName("Audi 8");
        return  vech;
    }

    @Primary
    @Bean(value = "mercedesVechicle")
    Vehicle vechicle2(){
        var vech = new Vehicle();
        vech.setName("Mercedes Benz");
        return  vech;
    }

    @Bean("bugattiVechicle")
    Vehicle vechicle3(){
        var vech = new Vehicle();
        vech.setName("Bugatti");
        return vech;
    }
}
