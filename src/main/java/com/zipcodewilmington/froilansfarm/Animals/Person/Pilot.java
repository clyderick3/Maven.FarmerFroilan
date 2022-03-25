package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class Pilot extends Person implements Rider {
    Aircraft aircraft;

    public Pilot(String name) {
        super(name);
    }

    @Override
    public boolean mount(Rideable rideable) {
        if (rideable instanceof Aircraft) {
            aircraft= (Aircraft) rideable;
            return true;
        }
        return false;
    }

    @Override
    public boolean dismount(Rideable rideable) {
        if (aircraft == null){
            return false;
        }
        aircraft = null;
        return true;
    }
}

// Froilanda uses the CropDuster to fly over the Field and fertilize each of the CropRow
// Froilanda = pilot/person object
// fertilieusingcropduster method --- fly submethod, fertilize submethod, land submethod
// fly method - input aircraft to be flown, plants to fertilzie,,, output



