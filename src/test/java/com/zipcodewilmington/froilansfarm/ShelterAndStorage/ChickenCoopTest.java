package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {

    @Test

    public void addToChickenCoopTest(){

        Chicken chicken = new Chicken();
        ChickenCoop chickenCoop = new ChickenCoop();

        chickenCoop.addResident(chicken);
        Assert.assertTrue(chickenCoop.contains(chicken));
    }
    @Test
    public void removeFromChickenCoopTest(){

        Chicken chicken = new Chicken();
        ChickenCoop chickenCoop = new ChickenCoop();

        chickenCoop.addResident(chicken);
        chickenCoop.removeResident(chicken);
        Assert.assertFalse(chickenCoop.contains(chicken));
    }

}