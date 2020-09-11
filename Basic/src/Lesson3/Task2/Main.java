package Lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Рыбка", "Квартира", "Шотланская", "Спокойный");
        animals[1] = new Dog("Косточка", "Будка", "Дворняга", "Средняя");
        animals[2] = new Horse("Сено", "Конюшня", "Белая");



        Veterinarian veterinarian = new Veterinarian();
        for(int i = 0; i < animals.length; i++) {
            veterinarian.treatAnimal(animals[i]);
        }
    }
}
