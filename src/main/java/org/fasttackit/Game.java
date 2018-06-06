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
        dog1.setFavoriteFoodName("Purina");
        dog1.setFavoriteActivityName("WonderWoof");

        Cat cat1 = new Cat();
        cat1.setName("Kity");
        cat1.setAge(0.7);
        cat1.setFeedingTimes(2);
        cat1.setColor("Gray");
        cat1.setFavoriteFoodName("Pate");
        cat1.setFavoriteActivityName("Trixie");

        Rescuer rescuer1 = new Rescuer();
        rescuer1.setName("Flaviu");
        rescuer1.setAge(20);
        rescuer1.setMoney(140.3);

        DogFood dogFood1 = new DogFood("Purina");
        dogFood1.setManufacturer("Purina");
        dogFood1.setPrice(32.5);
        dogFood1.setQuantity(500);

        rescuer1.feed(dog1,dogFood1);



    }
}
