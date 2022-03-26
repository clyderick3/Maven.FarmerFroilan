package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class Aircraft extends Vehicle {
    private boolean inAir = false;

    public boolean fly() {
        this.inAir = true;
        return this.inAir;
    }

    public boolean land() {
        this.inAir = false;
        return this.inAir;
    }

    public boolean inAirStatus() {
        return inAir;
    }
}
