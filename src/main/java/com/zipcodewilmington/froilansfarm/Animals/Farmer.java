package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Person.Person;
import com.zipcodewilmington.froilansfarm.Animals.Person.Rider;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;

public class Farmer extends Person implements Rider, Botanist{

    public void mount() {

    }

    public void dismount() {

    }

    @Override
    public <T extends Crop> boolean plant(T plantType, CropRow cropRow) {
        return false;
    }
}