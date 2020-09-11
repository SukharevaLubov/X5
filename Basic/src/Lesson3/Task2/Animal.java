package Lesson3.Task2;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Какое то животное шумит");

    }

    public void eat() {
        System.out.println("Животное ест какую то еду");

    }

    public void sleep() {
        System.out.println("Животное спит");

    }


}
