package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Animals.Person.Pilot;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.Farm;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropDusterTest {

    @Test

    void fertilize() {
    }

    @Test
    void operate() {
        // test input person not pilot
        // test input person pilot
    }
    @Test
    public void cropDusterConstructorTest(){
        CropDuster cropduster = new CropDuster(new Farm());
        Assert.assertTrue(cropduster instanceof Vehicle<Pilot>);
    }


}