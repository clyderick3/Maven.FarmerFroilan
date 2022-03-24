package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import com.zipcodewilmington.froilansfarm.Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Shelter <T extends Animal>{
    List<T> shelter = new ArrayList<>();

    public List<T> residentList() {
        return shelter;
    }

    public void addResident(T resident) {
        shelter.add(resident);
    }

    public void removeResident(T resident){
        shelter.remove(resident);
    }
}
