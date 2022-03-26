package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Plants.TomatoPlant;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    @Test
    void makeNoise() {
        Horse horse = new Horse();
        Assert.assertEquals("Neigh", horse.makeNoise());
    }

    @Test
    void eatInterfaceTest(){
        Horse horse = new Horse();
        Tomato tomato = new Tomato();
        Assert.assertTrue(horse.eat(tomato));
    }
}