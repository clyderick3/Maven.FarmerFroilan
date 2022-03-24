package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Edible;

public interface Eater<T extends Edible> {
    default boolean eat(T... food) {
        boolean hasEaten = true;
        return hasEaten;
    }
}