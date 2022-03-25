package com.zipcodewilmington.froilansfarm.Vehicle; // DONE

import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;
import com.zipcodewilmington.froilansfarm.Animals.Person.Person;

public interface FarmVehicle {
    <T extends Person> boolean operate(T person, CropRow... cropRow);
}