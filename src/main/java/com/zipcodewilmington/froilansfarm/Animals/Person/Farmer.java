package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;

public class Farmer extends Person implements Rider, Botanist {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public <T extends Crop> boolean plant(T plantType, CropRow cropRow) {
        cropRow.addPlant(plantType);
        return true;
    }

    @Override
    public boolean mount(Rideable rideable) {
        return false;
    }

    @Override
    public boolean dismount(Rideable rideable) {
        return false;
    }
}
