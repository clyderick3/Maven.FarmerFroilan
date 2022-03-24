package com.zipcodewilmington.froilansfarm;

public interface Botanist {
    <T extends Crop> boolean plant(T plantType, CropRow cropRow); 
}