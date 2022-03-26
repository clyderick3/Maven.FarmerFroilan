package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Plants.CornStalk;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;
import com.zipcodewilmington.froilansfarm.Animals.Person.Person;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.Farm;

public class Tractor extends Vehicle implements FarmVehicle {
    public Farm farm;

    public Tractor(Farm farm) {
        this.farm = farm;
    }

    public boolean harvest(CropRow... cropRows) {
        boolean successful = false;
        for (CropRow row : cropRows) {
            for (int i = 0; i < row.getCrops().size(); i++) {
                if (row.getCrops().get(i) instanceof TomatoPlant) {
                    if (((TomatoPlant) row.getCrops().get(i)).getHasBeenFertilized() == true) {
                        // row.getCrops().get(i)).yield and add to tomato reserves
                    }
                } else if (row.getCrops().get(i) instanceof CornStalk) {

                }
            }
        }
        // if fertilized = yes and harvested = no, proceed,
        // fertilized toggle - set for each plant
        // harvests a Crop
        // add plants to storeage
        // harvestedtoggle
        // boolean
        return successful;
    }

    public boolean operate(Person person, CropRow[] cropRow) {
        // any carryover from vehicle,
        // harvest
        // requires farmer?
        // use cropduster as template
        return false;
    }
}
