package Lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static int validate(String ask) {
        int result;
        while (true) {
            System.out.println(ask);
            Scanner scanner = new Scanner(System.in);
            try {
                result = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                String resultFall = scanner.nextLine();
                System.out.println("Ошибка " + e + "Не могу преобразовать " + resultFall + " в число. ");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = validate("Введите целое число ");
        System.out.println(number % 10);

    }
}
