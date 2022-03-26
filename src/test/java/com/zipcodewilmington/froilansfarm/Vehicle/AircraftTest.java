package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftTest {

    @Test
    void flyTest() {
        Aircraft aircraft = new Aircraft();
        Assert.assertTrue(aircraft.fly());
    }

    @Test
    void landTest() {
        Aircraft aircraft = new Aircraft();
        Assert.assertFalse(aircraft.land());
    }

    @Test
    void flyAndLandTest() {
        Aircraft aircraft = new Aircraft();
        Assert.assertTrue(aircraft.fly());
        Assert.assertFalse(aircraft.land());
    }

    @Test
    void inAirStatusTest() {
        Aircraft aircraft = new Aircraft();
        Assert.assertFalse(aircraft.inAirStatus());
        aircraft.fly();
        Assert.assertTrue(aircraft.inAirStatus());
    }
}