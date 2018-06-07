package org.fasttackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game1 {
    private Animals dog1;
    private Animals cat1;
    private List<Food> availableFood = new ArrayList<Food>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[2];

    public void start() {

        readName("Please enter your name: ");
        initAnimal();
    }

    private String readName(String s) {
        System.out.println(s);
        Scanner namescanner = new Scanner(System.in);
        return namescanner.nextLine();
    }

    private void initAnimal() {
        Dog dog1 = new Dog("Puppy");
        dog1.setAge(1.2);
        dog1.setHeight(2.5);
        dog1.setSex("F");
        dog1.setSpecies("Poodle");
        dog1.setFavoriteFoodName("Purina");
        dog1.setFavoriteActivityName("WonderWoof");
        System.out.println("Your animal is: " + dog1);
        readName("Please enter animal name: ");
    }
    private void activitiesLevel() {

    }

}

