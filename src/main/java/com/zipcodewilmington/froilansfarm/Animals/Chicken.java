package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Produce;

public class Chicken extends Animal implements Produce {
    Boolean isFertilized =false;
    public void yield() {
//        if (isFertilized=false)
//            return EdibleEgg;
//        else
//            return new Chicken();
    }

    @Override
    public String makeNoise() {
        return "Cluck!";
    }
}
