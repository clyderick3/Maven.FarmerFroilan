package com.zipcodewilmington.froilansfarm.Animals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    @Test
    void makeNoise() {
        Horse horse = new Horse();
        Assert.assertEquals("Neigh", horse.makeNoise());
    }
}