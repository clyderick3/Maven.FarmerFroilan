package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import com.zipcodewilmington.froilansfarm.Plants.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop> {
    private List<T> crops = new ArrayList<T>();

    public void addPlant(T crop){
        crops.add(crop);
    }

    public List<T> getCrops(){
        return crops;
    }

    public T harvest(int index){
//        crops.get(index).yield();
// output should be an edible food object
        // if harvested add to farm reserves


       // implement yield method
        // store returned food to respective reserves

        return null;
    }

    public void fertilize() {
        for (int i = 0; i < crops.size(); i++) {
            crops.get(i).setHasBeenFertilized(true);
        }

    }
}
