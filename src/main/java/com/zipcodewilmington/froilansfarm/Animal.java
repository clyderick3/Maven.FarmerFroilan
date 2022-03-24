package com.zipcodewilmington.froilansfarm; // DONE

public abstract class Animal<T extends Edible> implements NoiseMaker, Eater<T>{

    public boolean eat(T... food) {
        boolean hasEaten = true;
        return hasEaten;
    }

    public String makeNoise() {
        return "NOISE AND SOUNDS, ETC.";
    }
}
