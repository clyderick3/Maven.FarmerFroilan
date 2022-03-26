package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animals.Person.Rider;
import com.zipcodewilmington.froilansfarm.GeneralInterfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Rideable;

public abstract class Vehicle<T extends Rider> implements NoiseMaker, Rideable <T> {
    public String makeNoise() {
        return "engine hum";
    }
}
