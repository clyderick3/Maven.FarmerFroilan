package com.zipcodewilmington.froilansfarm.Plants;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Produce;

public class Crop implements Produce {
    boolean hasBeenHarvested;
    boolean hasBeenFertilized;

    public void yield() { // yields an edible object depending on its `hasBeenHarvested` and `hasBeenFertilized` flag.

    }
    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
    public boolean getGasBeenFertilized(){
        return this.hasBeenFertilized;
    }
}
