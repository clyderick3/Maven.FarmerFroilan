package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.ShelterAndStorage.Farm;

public class Person<T extends Edible> extends Animal {
    public Farm farm = new Farm();
    String name;

    public Person(String name){
        this.name=name;
    }
  
    @Override
    public boolean eat(Edible... food) {
        int foodItemsConsumed = 0;
        for (Edible foodItem : food) {
            if (foodItem instanceof Tomato) {
                if (farm.tomatoReserves.size() >= 1) {
                    farm.tomatoReserves.remove(0);
                    foodItemsConsumed += 1;
                }
            } else if (foodItem instanceof EarCorn) {
                if (farm.cornReserves.size() >= 1) {
                    farm.cornReserves.remove(0);
                    foodItemsConsumed += 1;
                }
            } else if (foodItem instanceof EdibleEgg) {
                if (farm.eggReserves.size() >= 1) {
                    farm.eggReserves.remove(0);
                    foodItemsConsumed += 1;
                }
            }
        }
        return foodItemsConsumed == food.length; // returns false unless a full meal is eaten
    }


    @Override
    public String makeNoise() {
        return "Argh";
    }
}

