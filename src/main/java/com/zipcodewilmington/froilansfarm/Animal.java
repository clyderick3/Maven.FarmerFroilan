package com.zipcodewilmington.froilansfarm;

public abstract class Animal<T extends Edible> implements NoiseMaker, Eater<T>{
    public boolean eat(T food) {
        return false;
    }

    public String makeNoise() {
        return null;
    }
}
