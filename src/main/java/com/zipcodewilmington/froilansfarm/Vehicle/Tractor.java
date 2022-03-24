package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;
import com.zipcodewilmington.froilansfarm.Animals.Person.Person;

public class Tractor extends Vehicle implements FarmVehicle {
    public void harvest() { // TODO - return type/inputs
        // harvests a Crop
    }

    public boolean operate(Person person, Crop[] crop) {
        return false;
    }

    public boolean operate(Person person, CropRow[] cropRow) {
        return false;
    }
}
