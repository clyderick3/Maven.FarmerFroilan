package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;

import java.util.ArrayList;

public class Farm { // Farm` stores many `Stable`, many `ChickenCoop`, and a single `FarmHouse`
    FarmHouse farmhouse;
    public ArrayList<EarCorn> cornReserves = new ArrayList();
    public ArrayList<EdibleEgg> eggReserves = new ArrayList();
    public ArrayList<Tomato> tomatoReserves = new ArrayList();

    public void Farm() {

    }
}
