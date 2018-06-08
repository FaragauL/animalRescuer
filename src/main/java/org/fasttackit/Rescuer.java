package org.fasttackit;

import java.util.Scanner;

public class Rescuer {

    private String name;
    private double money;
    private double age;


    public void feed (Animals animal, Food food) {
        animal.setHungerLevel(42.6);
        System.out.println("Hungry level is: " + animal.getHungerLevel());
        System.out.println(name + " " + "just gave some " + food.getName()+ " " + " food to " + animal.getName());
        System.out.println("Enter food quantity: ");
        Scanner scanner = new Scanner(System.in);
        double foodQuantity = scanner.nextDouble();
        animal.setHungerLevel(animal.getHungerLevel()-foodQuantity);
        System.out.println("New hungry level is: " + animal.getHungerLevel());
    }

    public void entertainment (Animals animal, EntertainmentActivity entertainmentActivity){
        System.out.println("Activity level is: " + animal.getActivityLevel());
        System.out.println(name + " " + "just play with " + animal.getName() + " " +entertainmentActivity.getName() );
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
