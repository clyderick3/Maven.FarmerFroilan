package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.EdibleEgg;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    @Test
    void makeNoise() {
        Chicken chicken = new Chicken();
        Assert.assertEquals("Cluck!", chicken.makeNoise());
    }

    @Test
    void yield() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken.yield(chicken) instanceof EdibleEgg);
    }
}