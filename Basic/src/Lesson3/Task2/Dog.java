package Lesson3.Task2;

public class Dog extends Animal{
    String breed;
    String size;

    public Dog(String food, String location, String breed, String size) {
        super(food, location);
        this.breed = breed;
        this.size = size;
    }

    public void makeNoise() {
        System.out.println("Собака играет в палочку");
    }

    public void eat() {
        System.out.println("Собака грызет косточку");

    }
}
