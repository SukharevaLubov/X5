package Lesson3.Task2;

public class Cat extends Animal{
    String breed;
    String temperament;

    public Cat(String food, String location, String breed, String temperament) {
        super(food, location);
        this.breed = breed;
        this.temperament = temperament;
    }

    public void makeNoise() {
        System.out.println("Котик играет с мышкой");

    }

    public void eat() {
        System.out.println("Кот ест рыбу");

    }
}
