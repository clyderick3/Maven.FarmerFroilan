package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StableTest {

    @Test

    public void addToStableTest(){

        Horse horse = new Horse();
        Stable stable = new Stable();

        stable.addResident(horse);
        Assert.assertTrue(stable.contains(horse));
    }
    @Test
    public void removeFromStableTest(){

        Horse horse = new Horse();
        Stable stable = new Stable();

        stable.addResident(horse);
        stable.removeResident(horse);
        Assert.assertFalse(stable.contains(horse));
    }

}