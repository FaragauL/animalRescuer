package org.fasttackit;

public class Game {

    private Animals dog1;
    private Animals cat1;
    public void start() {

        Dog dog1 = new Dog();
        dog1.setName("Puppy");
        dog1.setAge(1.2);
        dog1.setFeedingTimes(3);
        dog1.setBreed("Poodle");
        dog1.setFavoriteFoodName("Bacon");
        dog1.setFavoriteActivityName("WonderWoof");

        Cat cat1 = new Cat();
        cat1.setName("Kity");
        cat1.setAge(0.7);
        cat1.setFeedingTimes(2);
        cat1.setColor("Gray");
        cat1.setFavoriteFoodName("Pate");
        cat1.setFavoriteActivityName("Trixie");
    }
}
