package com.company.species;

import com.company.Animals.Reptiles;

class Crocodile extends Reptiles {
    public String name;
    public Crocodile(String sound, String name) {
        super("grunt");
        this.name = name;
    }
}
