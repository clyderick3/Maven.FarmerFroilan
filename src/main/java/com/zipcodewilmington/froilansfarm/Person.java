package com.zipcodewilmington.froilansfarm;

public class Person<T extends Edible> extends Animal{
    public Farm farm = new Farm();

    public void Person(){
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

}

    @Override
    public String makeNoise() {
        return "Argh";
    }
}

