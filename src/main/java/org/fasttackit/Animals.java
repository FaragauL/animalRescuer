package org.fasttackit;

public class Animals {

    private String name;
    private double age;
    private int feedingTimes;
    private String favoriteFoodName;
    private String favoriteActivityName;
    private double hungerLevel;

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

    public int getFeedingTimes() {
        return feedingTimes;
    }

    public void setFeedingTimes(int feedingTimes) {
        this.feedingTimes = feedingTimes;
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
}
