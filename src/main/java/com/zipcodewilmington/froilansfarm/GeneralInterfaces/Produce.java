package com.zipcodewilmington.froilansfarm.GeneralInterfaces;

import com.zipcodewilmington.froilansfarm.Food.Edible;

public interface Produce <U extends Produce> { // TODO - we think this is a factory or builder

    <T extends Edible> T yield(U producer); // TODO - add edible return type, parameter is boolean isFertilized
}

// `Produce` can `yield` an `Edible` object depending on their `hasBeenFertilized` [flag]
