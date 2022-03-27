package com.zipcodewilmington.froilansfarm.Plants;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Produce;

public class Crop <U extends Crop> implements Produce {
    boolean hasBeenHarvested;
    boolean hasBeenFertilized;

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
    public boolean getHasBeenFertilized(){
        return this.hasBeenFertilized;
    }
    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
    public boolean getHasBeenHarvested(){
        return this.hasBeenHarvested;
    }

    @Override
    public Edible yield(Produce inputPlant) {// yields an edible object depending on its `hasBeenHarvested` and `hasBeenFertilized` flag.
// takes in input of plant and gives output of edible

        if (inputPlant instanceof TomatoPlant && ((TomatoPlant)inputPlant).hasBeenFertilized) {
            ((TomatoPlant)inputPlant).setHasBeenHarvested(true);
            return new Tomato();

        } else if ( inputPlant instanceof CornStalk && ((CornStalk)inputPlant).hasBeenFertilized) {
            ((CornStalk)inputPlant).setHasBeenHarvested(true);
            return new EarCorn();
        }
        return null;
    }
}
