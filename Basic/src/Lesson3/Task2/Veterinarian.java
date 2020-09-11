package Lesson3.Task2;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println(animal.food + "  " + animal.location);
        animal.eat();
    }
}
