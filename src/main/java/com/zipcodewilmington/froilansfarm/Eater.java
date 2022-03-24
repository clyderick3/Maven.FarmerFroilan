package com.zipcodewilmington.froilansfarm;

public interface Eater<T extends Edible> { // TODO <T implements Edible>

    boolean eat(T... food); // TODO confirm return type, add input
}
