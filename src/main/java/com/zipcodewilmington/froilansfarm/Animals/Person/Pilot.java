package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class Pilot extends Person implements Rider {
    Rideable rideable;


    public Pilot(String name) {
        super(name);
    }

    @Override
    public boolean mount(Rideable rideable) {
        if (this.rideable!=null)
            return false;
        else if (rideable instanceof Aircraft) {
            this.rideable= rideable;
            return true;
        } else if (rideable instanceof Horse){
            return true;
        }
        return false;
    }

    @Override
    public boolean dismount(Rideable rideable) {
        if (this.rideable==null)
            return false;
        if (this.rideable.equals(rideable)) {
            this.rideable = null;
            return true;
        }
        return false;
    }
}

// Froilanda uses the CropDuster to fly over the Field and fertilize each of the CropRow
// Froilanda = pilot/person object
// fertilieusingcropduster method --- fly submethod, fertilize submethod, land submethod
// fly method - input aircraft to be flown, plants to fertilzie,,, output



