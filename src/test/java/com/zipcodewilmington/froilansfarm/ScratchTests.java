package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Person.Person;
import com.zipcodewilmington.froilansfarm.Food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;

class ScratchTests {

    @org.junit.jupiter.api.Test
    void eatTest() {
        Person person = new Person("");
        EarCorn earCorn1 = new EarCorn();
        EarCorn earCorn2 = new EarCorn();
        EdibleEgg edibleEgg1 = new EdibleEgg();
        Tomato tomato1 = new Tomato();
        person.farm.tomatoReserves.add(tomato1);
        person.farm.eggReserves.add(edibleEgg1);
        person.farm.cornReserves.add(earCorn1);
        person.farm.cornReserves.add(earCorn2);
        boolean actual = person.eat(earCorn1, earCorn2, edibleEgg1, tomato1);
        Assert.assertTrue(actual);
    }
}