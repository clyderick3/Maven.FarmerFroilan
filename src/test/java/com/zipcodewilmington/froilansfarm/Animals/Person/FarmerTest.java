package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Plants.CornStalk;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.CropRow;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.Farm;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void plant() {
        CropRow cropRow = new CropRow();
        Farmer farmer = new Farmer("");
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(farmer.plant(cornStalk, cropRow));
    }

    @Test
    void mount(){
        CropDuster cropDuster = new CropDuster(new Farm());
        Farmer farmer =  new Farmer("");
        Tractor tractor = new Tractor();
        Horse horse = new Horse();
        Assert.assertFalse(farmer.mount(cropDuster)); //not right type
        Assert.assertFalse(farmer.dismount(tractor)); //not riding anything
        Assert.assertTrue(farmer.mount(tractor));
        Assert.assertFalse(farmer.dismount(horse)); //dismount something it's not riding
        Assert.assertFalse(farmer.mount(horse)); //already riding something
        Assert.assertTrue(farmer.dismount(tractor));
        Assert.assertTrue(farmer.mount(horse));
    }
}