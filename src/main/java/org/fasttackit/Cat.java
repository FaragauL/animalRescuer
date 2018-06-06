package org.fasttackit;

public class Cat extends Animals {

    private String color;

    public Cat(String name) {
        super(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
