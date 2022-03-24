package com.zipcodewilmington.froilansfarm;

public abstract class Animal<T extends Edible> implements NoiseMaker, Eater<T>{

    public boolean eat(T... food) {
        boolean hasEaten = true;
        return hasEaten;
    }

    public String makeNoise() { // TODO
        return null;
    }
}
