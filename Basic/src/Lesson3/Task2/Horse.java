package Lesson3.Task2;

public class Horse extends Animal{

    String colorMane;

    public Horse(String food, String location, String colorMane) {
        super(food, location);
        this.colorMane = colorMane;
    }

    public void makeNoise() {
        System.out.println("Лошадь горцует");

    }

    public void eat() {
        System.out.println("Лошадь ест сено");

    }
}
