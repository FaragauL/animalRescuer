package org.fasttackit;

public class Rescuer {

    private String name;
    private double money;
    private double age;

    public void feed (Animals animal, Food food) {
        System.out.println(name + " " + "just gave some " + food.getName()+ " " + " food to " + animal.getName());
        animal.setHungerLevel(animal.getHungerLevel() - 1);
        System.out.println(name + " " + " just gave some " + food.getName()+ " " + " food to " + animal.getName()+ animal.getHungerLevel());

    }
    public void entertainment (Animals animal, EntertainmentActivity entertainmentActivity){
        System.out.println(name + " " + "just play with " + animal.getName() + " " +entertainmentActivity.getName() );
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
