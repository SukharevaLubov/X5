package Lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    public static int initialization() {
        int result;
        while(true) {
            System.out.println("Введите целое число ");
            Scanner scanner = new Scanner(System.in);
            try {
                result = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                String resultFall = scanner.nextLine();
                System.out.println("Ошибка " + e + "!!  Не могу преобразовать " + resultFall + " в число. ");
            }
        }
        return result;
    }

    public static void description(int number) {
        String result = "";
        if(number != 0) {
            result = number < 0 ? "Отрицательное " : "Положительное ";
            result += number % 2 == 0 ? "четное число " : "нечетное число ";
        } else {
            result = "нулевое число ";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int number = initialization();
        description(number);

    }
}
