package org.fasttackit;

public class CatFood extends Food {

    private String taste;

    public CatFood(String name) {
        super(name);
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
