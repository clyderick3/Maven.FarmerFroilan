package com.zipcodewilmington.froilansfarm.Vehicle; // DONE

import com.zipcodewilmington.froilansfarm.Animals.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class Aircraft extends Vehicle <Pilot> {
    private boolean inAir = false;

    public boolean fly() {
        boolean successful = false;
        if (inAir == false) {
            successful = true;
            inAir = true;
        }
        return successful;
    }

    public boolean land() {
        boolean successful = false;
        if (inAir == true) {
            successful = true;
            inAir = false;
        }
        return successful;
    }

    public boolean inAirStatus() {
        return inAir;
    }
}
