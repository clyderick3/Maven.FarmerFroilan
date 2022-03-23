package com.zipcodewilmington.froilansfarm;

public abstract class Animal implements NoiseMaker, Eater{
    public boolean eat() {
        return false;
    }

    public String makeNoise() {
        return null;
    }
}
