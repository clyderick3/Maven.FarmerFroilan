package com.zipcodewilmington.froilansfarm.Vehicle; // DONE

import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;
import com.zipcodewilmington.froilansfarm.Animals.Person.Person;
import com.zipcodewilmington.froilansfarm.Animals.Person.Pilot;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.Farm;

public class CropDuster extends Aircraft implements FarmVehicle {
    public Farm farm;

    public CropDuster(Farm farm) {
        this.farm = farm;
    }

    public boolean fertilize(CropRow... cropRows) {
        boolean successful = false;
        if (inAirStatus() == true) {
            for (CropRow cropRow : cropRows) {
                cropRow.fertilize();
            }
            successful = true;
        }
        return successful;
    }

    public boolean operate(Person person, CropRow[] cropRows) {
        boolean successful = false;
        if (person instanceof Pilot) {
            fly();
            fertilize(cropRows);
            land();
            successful = true;
        }
        return successful;
    }
}
