package com.zipcodewilmington.froilansfarm;

public interface FarmVehicle<T extends Person> {

    public boolean operate(T person, CropRow... cropRow);
}
