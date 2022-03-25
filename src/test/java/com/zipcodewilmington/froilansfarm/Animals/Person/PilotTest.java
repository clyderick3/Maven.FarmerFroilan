package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {

    @Test
    void mount() {
        Pilot pilot = new Pilot("");
        Aircraft aircraft = new Aircraft();
        Assert.assertTrue(pilot.mount(aircraft));
    }

    @Test
    void dismount() {
    }
}