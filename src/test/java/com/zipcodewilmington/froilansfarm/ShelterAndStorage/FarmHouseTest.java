package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import com.zipcodewilmington.froilansfarm.Animals.Person.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class FarmHouseTest {

    @Test
    public void setPeopleTest(){
        ArrayList<Person> human = new ArrayList<Person>();
        FarmHouse newFarmhouse = new FarmHouse();
        newFarmhouse.setPeople(human);
        Assert.assertEquals(human, newFarmhouse.getPeople());
    }
}
