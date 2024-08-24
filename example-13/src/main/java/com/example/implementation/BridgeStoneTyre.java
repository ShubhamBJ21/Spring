package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle Moving on BridgeStone Tyre";
    }
}
