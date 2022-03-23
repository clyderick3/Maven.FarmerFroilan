package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop> {
    private List<T> crops = new ArrayList<T>();

    public void add(T crop){
        // add to List crops
    }

    public List<T> getCrops(){
        return null;
    }

    public T harvest(int index){
        // increase count of EarCorn/Tomatoes?
        return null;
    }
}
