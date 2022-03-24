package com.zipcodewilmington.froilansfarm; // DONE

public interface Botanist<T extends Crop> {
    boolean plant(T plantType, CropRow cropRow);
}

