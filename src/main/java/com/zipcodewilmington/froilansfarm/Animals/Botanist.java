package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;

public interface Botanist {
    <T extends Crop> boolean plant(T plantType, CropRow cropRow);
}