package com.zipcodewilmington.froilansfarm;

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
        // increase count of EarCorn/Tomatoes?
        return null;
    }

    public void fertilize() {
        for (int i = 0; i < crops.size(); i++) {
            crops.get(i).hasBeenFertilized = true;
        }
    }
}
