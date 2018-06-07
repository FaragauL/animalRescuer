package org.fasttackit;

public class Animals {

    private String name;
    private double age;
    private double height;
    private String sex;
    private String favoriteFoodName;
    private String favoriteActivityName;
    private double hungerLevel;
    private double activityLevel;
    public Animals animals;

    public Animals(String name) {
        this.name = name;
    }

    public double getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }

    public String getFavoriteActivityName() {
        return favoriteActivityName;
    }

    public void setFavoriteActivityName(String favoriteActivityName) {
        this.favoriteActivityName = favoriteActivityName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }

    public double getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(double activityLevel) {
        this.activityLevel = activityLevel;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Age=" + age +
                ", Height=" + height +
                ", Sex='" + sex + '\'' +
                ", FavoriteFoodName='" + favoriteFoodName + '\'' +
                ", FavoriteActivityName='" + favoriteActivityName + '\'' +
                ", HungerLevel=" + hungerLevel;
    }
}
