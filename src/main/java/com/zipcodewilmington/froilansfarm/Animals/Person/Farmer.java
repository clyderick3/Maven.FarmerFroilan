package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class Farmer extends Person implements Rider, Botanist {
    Rideable mount;

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
        if (mount!=null)
            return false;
        else if (rideable instanceof Aircraft)
            return false;
        else {
            mount = rideable;
            return true;
        }
    }

    @Override
    public boolean dismount(Rideable rideable) {
        if (mount == null)
            return false;
        if (mount.equals(rideable)) {
            mount = null;
            return true;
        }
        return false;
    }
}
