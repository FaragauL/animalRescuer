package org.fasttackit;

import java.util.Scanner;

public class Rescuer {

    private String name;
    private double money;
    private double age;


    public void feed (Animals animal, Food food) {
        System.out.println("Hungry level is: " + animal.getHungerLevel());
        readName("Enter food quantity: ");
        double foodQuantity = food.getQuantity();
        System.out.println(name + " " + "just gave some " + food.getName()+ " " + " food to " + animal.getName());
        animal.setHungerLevel(animal.getHungerLevel() - 1);


    }
    public void entertainment (Animals animal, EntertainmentActivity entertainmentActivity){
        System.out.println(name + " " + "just play with " + animal.getName() + " " +entertainmentActivity.getName() );
        double currentActivityLevel = animal.getActivityLevel();
    }
    private String readName( String s) {
        System.out.println(s);
        Scanner namescanner = new Scanner(System.in);
        return namescanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
