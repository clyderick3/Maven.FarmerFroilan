package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    public String makeNoise() {
        return null;
    }
}
