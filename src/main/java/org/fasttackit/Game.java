package org.fasttackit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private Animals dog1;
    private Animals cat1;
    private List<Food> availableFood = new ArrayList<Food>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[5];

    public List<Food> getAvailableFood() {
        return availableFood;
    }

    public EntertainmentActivity[] getAvailableActivities() {
        return availableActivities;
    }

    private void initFood() {
        availableFood.add(new Food("Pedigree"));
        availableFood.add(new Food("Purina"));
    }

    public void start() {

        Dog dog1 = new Dog("Puppy");
        dog1.setName("Puppy");
        dog1.setAge(1.2);
        dog1.setHeight(2.5);
        dog1.setSex("F");
        dog1.setBreed("Poodle");
        dog1.setFavoriteFoodName("Purina");
        dog1.setFavoriteActivityName("WonderWoof");

        Cat cat1 = new Cat("Kity");
        cat1.setName("Kity");
        cat1.setAge(0.7);
        cat1.setHeight(1.8);
        cat1.setSex("M");
        cat1.setColor("Gray");
        cat1.setFavoriteFoodName("Pate");
        cat1.setFavoriteActivityName("Trixie");

        Rescuer rescuer1 = new Rescuer();
        rescuer1.setName("Lavi");
        rescuer1.setAge(20);
        rescuer1.setMoney(140.3);

        DogFood dogFood1 = new DogFood("Purina");
        dogFood1.setManufacturer("Purina");
        dogFood1.setPrice(32.5);
        dogFood1.setQuantity(500);

        Food food = new Food("Pedigree");

        EntertainmentActivity entertainmentActivity1 = new EntertainmentActivity("WonderWoof");
        EntertainmentActivity entertainmentActivity2 = new EntertainmentActivity("Trixie");


        rescuer1.feed(dog1, dogFood1);
        rescuer1.entertainment(dog1, entertainmentActivity1);
        System.out.println(getAvailableFood(initFood()));
    }
}
