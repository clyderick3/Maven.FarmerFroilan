package com.zipcodewilmington.froilansfarm.GeneralInterfaces;

public interface Produce { // TODO - we think this is a factory or builder
    void yield(); // TODO - add edible return type, parameter is boolean isFertilized
}

// `Produce` can `yield` an `Edible` object depending on their `hasBeenFertilized` [flag]
