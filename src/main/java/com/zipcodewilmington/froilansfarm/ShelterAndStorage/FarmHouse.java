package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import com.zipcodewilmington.froilansfarm.Animals.Person.Person;

import java.util.ArrayList;

public class FarmHouse {

    //Removed Farmhouse "extends Shelter<Person>"
    //FarmHouse contains animals like a shelter.
    //Create an ArrayList for the people that live in the farmhouse plus a constructor.

        ArrayList<Person> people;

        public void Farmhouse(){
            people = new ArrayList<>();
        }

        public void setPeople(ArrayList<Person> people ) {
            this.people = people;
    }

        public ArrayList<Person> getPeople() {
            return people;
    }

}
