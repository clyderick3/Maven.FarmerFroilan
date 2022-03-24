package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;

public interface Botanist {
    <T extends Crop> void plant(T plantType, CropRow cropRow); // TODO - return type (might be crop)
}
