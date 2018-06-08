package org.fasttackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game1 {
    private Animals dog1;
    private Animals cat1;
    private List<Food> availableFood = new ArrayList<Food>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[2];
    private String name;

    public void start() {

        readName("Please enter your name: ");
        initAnimal();
        initFood();

    }

    private String readName(String s) {
        System.out.println(s);
        Scanner namescanner = new Scanner(System.in);
        name = namescanner.nextLine();
        return name;
    }

    private void initAnimal() {
        Dog dog1 = new Dog("Puppy");
        dog1.setName(readName(name));
        dog1.setAge(1.2);
        dog1.setHeight(2.5);
        dog1.setSex("F");
        dog1.setSpecies("Poodle");
        dog1.setFavoriteFoodName("Purina");
        dog1.setFavoriteActivityName("WonderWoof");
        System.out.println("Your animal has: " + dog1);
        readName("Please enter animal name: ");
        System.out.println(readName("Your animal is: " + name));
    }

    private void initFood() {
        availableFood.add(new Food("Purina"));
        availableFood.add(new Food("Pedigree"));
        availableFood.add(new Food("Oasy"));
        availableFood.add(new Food("Rustican"));
        System.out.println("Food list for your animal is: ");
        for (Food item : availableFood)
            System.out.println(item.getName());
        readFood("Enter a food from the list: ");
    }

    private void readFood(String s) {


            System.out.println(s);
            Scanner nameFood = new Scanner(System.in);
            String stringNameFood = nameFood.nextLine();
            availableFood.contains(stringNameFood);
        if (availableFood.contains(stringNameFood)) {
            System.out.println("Your choose is: " + stringNameFood);
            }else System.out.println("Enter a valid food from list: ");
//            for (int i = 0; i <= availableFood.size(); i++) {
//                String foodFromList = availableFood.get(i).getName();
//                if (stringNameFood == foodFromList) {
//                    System.out.println("Your choose is: " + stringNameFood);
//                } //else System.out.println("Enter a valid food from list: ");
//                food = false;
//                break;

    }


    public List<Food> getAvailableFood() {
        return availableFood;
    }

    public void setAvailableFood(List<Food> availableFood) {
        this.availableFood = availableFood;
    }
}

