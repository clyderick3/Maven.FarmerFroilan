package com.zipcodewilmington.froilansfarm;

public class Aircraft extends Vehicle{
    private boolean inAir = false;

    public void fly() {
        inAir = true;
    }

    public void land() {
        inAir = false;
    }

    public boolean inAirStatus() {
        return inAir;
    }
}
