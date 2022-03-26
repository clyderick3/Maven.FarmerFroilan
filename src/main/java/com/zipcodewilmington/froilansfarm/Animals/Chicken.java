package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Produce;

public class Chicken extends Animal implements Produce {
    Boolean hasBeenFertilized =false;

    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    @Override
    public Edible yield(Produce producer) {
        if (!hasBeenFertilized)
            return new EdibleEgg();
        return null;
    }
}
