package org.fasttackit;

public class Dog extends Animals {

    private String species;

    public Dog(String name) {
        super(name);
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
