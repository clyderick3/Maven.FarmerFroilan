package com.zipcodewilmington.froilansfarm.Plants;


import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Produce;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropTest {

    @Test
    public void tomatoYieldTest() {

        TomatoPlant tomatoPlant1 = new TomatoPlant();
        tomatoPlant1.hasBeenFertilized = true;

        Assert.assertTrue(tomatoPlant1.yield(tomatoPlant1) instanceof Tomato);

    }

    @Test
    public void cornYieldTest() {

        CornStalk cornStalk1 = new CornStalk();
       cornStalk1.hasBeenFertilized = true;
        Assert.assertTrue(cornStalk1.yield(cornStalk1) instanceof EarCorn);

    }

    @Test
    public void noCornYieldTest() {

        CornStalk cornStalk1 = new CornStalk();
        cornStalk1.hasBeenFertilized = false;
        Assert.assertFalse(cornStalk1.yield(cornStalk1) instanceof EarCorn);

    }
    @Test
    public void noTomatoYieldTest() {

        TomatoPlant tomatoPlant1 = new TomatoPlant();
        tomatoPlant1.hasBeenFertilized = false;

        Assert.assertTrue(tomatoPlant1.yield(tomatoPlant1) instanceof Tomato);

    }
    @Test
    public void setFertilizeTest() {

        CornStalk cornStalk1 = new CornStalk();
        cornStalk1.setHasBeenFertilized(true);
        Assert.assertTrue(cornStalk1.hasBeenFertilized);
    }
    @Test
    public void getFertilizeTest() {

        CornStalk cornStalk1 = new CornStalk();
        cornStalk1.setHasBeenFertilized(true);

        Assert.assertTrue(cornStalk1.getHasBeenFertilized());
    }
}