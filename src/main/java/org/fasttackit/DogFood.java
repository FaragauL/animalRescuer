package org.fasttackit;

public class DogFood extends Food {

    private String manufacturer;

    public DogFood(String name) {
        super(name);
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
