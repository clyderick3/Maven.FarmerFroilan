package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Produce;

public class Chicken extends Animal implements Produce {
    Boolean isFertilized =false;

    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    @Override
    public Edible yield(Produce producer) {
        //        if (isFertilized=false)
//            return EdibleEgg;
//        else
//            return new Chicken();
        return null;
    }
}
