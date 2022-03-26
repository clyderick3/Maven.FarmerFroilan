package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {

    @Test
    void mount() {
        Pilot pilot = new Pilot("");
        Aircraft aircraft = new Aircraft();
        Horse horse = new Horse();
        Assert.assertTrue(pilot.mount(aircraft));
        Assert.assertFalse(pilot.mount(horse));
        Assert.assertFalse(pilot.dismount(horse));
        Assert.assertTrue(pilot.dismount(aircraft));
        Assertions.assertTrue(pilot.mount(horse));
    }

    @Test
    void dismount() {
        Pilot pilot = new Pilot("");
        Aircraft aircraft = new Aircraft();
        Assert.assertFalse(pilot.dismount(aircraft));
        pilot.mount(aircraft);
        Assert.assertTrue(pilot.dismount(aircraft));
    }

    @Test
    void name(){
        Pilot pilot = new Pilot("Sam");
        String actual = pilot.getName();
        Assertions.assertEquals("Sam", actual);
    }

    @Test
    void noise(){
        Pilot pilot = new Pilot("");
        Assertions.assertEquals("Argh", pilot.makeNoise());
    }

    @Test
    void mountTractor(){
        Pilot pilot = new Pilot("");
        Tractor tractor = new Tractor();
        Assertions.assertFalse(pilot.mount(tractor));
    }
}