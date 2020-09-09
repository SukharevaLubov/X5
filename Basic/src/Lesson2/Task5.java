package Lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {

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

    public static void main(String[] args) {
        int num1 = initialization();
        int num2 = initialization();
        int num3 = initialization();

        if(num1 < num2) {
            if(num1 < num3){
                System.out.println("Наименьшее число " + num1);
            } else System.out.println("Наименьшее число " + num3);
        } else if(num2 < num3) {
            System.out.println("Наименьшее число " + num2);
        } else System.out.println("Наименьшее число " + num3);
    }
}
