package Lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

    public static int initialization() {
        int result;
        while(true) {
            System.out.println("Введите код города: ");
            System.out.println("Москва - 905");
            System.out.println("Ростов - 194");
            System.out.println("Краснодар - 491");
            System.out.println("Киров - 800");
            Scanner scanner = new Scanner(System.in);
            try {
                result = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                String resultFall = scanner.nextLine();
                System.out.println("Вы ввели не число! Попробуйте снова.");
            }
        }
        return result;
    }

    public static void cost(int number) {
        switch (number) {
            case 905 :
                System.out.println("Москва. Стоимость разговора: 41.5");
                break;
            case 194 :
                System.out.println("Ростов. Стоимость разговора: 19.8");
                break;
            case 491 :
                System.out.println("Краснодар. Стоимость разговора: 26.9");
                break;
            case 800 :
                System.out.println("Киров. Стоимость разговора: 50.0");
                break;
            default:
                System.out.println("Вы ввели код города не из списка.");
        }

    }

    public static void main(String[] args) {
        cost(initialization());

    }
}
