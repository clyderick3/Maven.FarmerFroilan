package com.zipcodewilmington.froilansfarm.Animals.Person;

import com.zipcodewilmington.froilansfarm.GeneralInterfaces.Rideable;

public interface Rider {
    boolean mount(Rideable rideable);

    boolean dismount(Rideable rideable);
}
