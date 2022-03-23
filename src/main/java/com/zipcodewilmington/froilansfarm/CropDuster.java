package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Aircraft implements FarmVehicle{
    public boolean operate() {
        return false;
    }
}

// fly
// fertilize - toggles hasbeenfertilized variable in Crops, return boolean, given crop row
