package com.zipcodewilmington.froilansfarm;

public interface Botanist {
    <T extends Crop> void plant(T plantType, CropRow cropRow); // TODO - return type (might be crop)
}
