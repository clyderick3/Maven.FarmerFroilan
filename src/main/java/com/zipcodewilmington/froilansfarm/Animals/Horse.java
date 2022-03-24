package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Rideable;

public class Horse extends Animal implements Rideable {

    @Override
    public String makeNoise() {
        return "Neigh";
    }
}
