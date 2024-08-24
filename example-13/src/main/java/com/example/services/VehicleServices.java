package com.example.services;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String tyre = tyres.rotate();
        System.out.println(tyre);
    }

    public Speakers getSpeakers(){
        return speakers;
    }

    public Tyres getTyres(){
        return tyres;
    }
}
