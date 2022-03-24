package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce{
    public void yield() { // TODO yields edibleEggs
    }

    @Override
    public String makeNoise() {
        return "Cluck!";
    }
}
