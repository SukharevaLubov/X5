package Lesson2;

import java.util.Scanner;

public class Task2 {

    public static int[] numbers(String ask) {
        int[] result = new int[3];
        while (true) {
            System.out.println(ask);
            Scanner scanner = new Scanner(System.in);
            String[] arr = scanner.nextLine().split("");
            if (arr.length > 3) {
                if (arr[0].equals("-") && arr.length == 4) {
                    arr[0] = arr[0] + arr[1];
                    arr[1] = arr[2];
                    arr[2] = arr[3];
                    arr[3] = null;
                } else if (arr.length < 2 || arr.length > 3) {
                    System.out.println("Необходимо ввести целое трехзначное число ");
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    try {
                        result[i] = Integer.parseInt(arr[i]);

                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка " + e + "Вы ввели не корректное число ");
                    }
                }
            }
        }
        return result;
    }

    public static void sum(int[] numbers) {
        int result = 0;
        for(int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arrNumbers = numbers("Введите трехзначное число ");
        sum(arrNumbers);
    }
}
