package Lesson3.Task1;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "Телефон " + number);
    }

    public static void sendMessage(int...numbers) {
        for (int i : numbers) {
            System.out.println("Отправлено сообщение на номер " + i);
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone1.number + " " + phone1.weight + " " + phone1.model);
        System.out.println(phone2.number + " " + phone2.weight + " " + phone2.model);
        System.out.println(phone3.number + " " + phone3.weight + " " + phone3.model);

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        receiveCall("Ульяна");
        receiveCall("Петя", 123456);
        sendMessage(1234, 4565, 3427, 56678);

    }
}
