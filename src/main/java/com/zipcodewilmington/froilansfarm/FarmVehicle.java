package com.zipcodewilmington.froilansfarm;

public interface FarmVehicle {
    <T extends Person> boolean operate(T person, CropRow... cropRow);
}
