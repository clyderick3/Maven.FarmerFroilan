package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Produce;

public class Chicken extends Animal implements Produce {
    public void yield() { // TODO yields edibleEggs
    }

    @Override
    public String makeNoise() {
        return "Cluck!";
    }
}
