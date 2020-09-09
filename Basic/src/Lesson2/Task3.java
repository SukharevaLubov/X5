package Lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

    public static int initialization() {
        int result;
        while (true) {
            System.out.println("Введите целое число ");
            Scanner scanner = new Scanner(System.in);
            try {
                result = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                String resultFall = scanner.nextLine();
                System.out.println("Ошибка " + e + "!!! Не могу преобразовать " + resultFall + " в число. ");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = initialization();
        if(number > 0) {
            number += 1;
        }
        System.out.println(number);

    }
}
