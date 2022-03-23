package com.zipcodewilmington.froilansfarm;

public class Tractor extends Vehicle implements FarmVehicle{
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
