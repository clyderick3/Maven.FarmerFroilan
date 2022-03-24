package com.zipcodewilmington.froilansfarm;

public interface Eater<T extends Edible> {
    default boolean eat(T... food) {
        boolean hasEaten = true;
        return hasEaten;
    }
}