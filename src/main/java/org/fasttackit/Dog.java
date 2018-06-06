package org.fasttackit;

public class Dog extends Animals {

    private String breed;

    public Dog(String name) {
        super(name);
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
