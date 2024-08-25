package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyres {

    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}