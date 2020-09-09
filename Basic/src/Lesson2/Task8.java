package Lesson2;

public class Task8 {

    public static void max(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение равно = " + max);
    }

    public static void summaPositive(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                result += arr[i];
            }
        }
        System.out.println("Сумма положительных элементов равно = " + result);
    }

    public static void summaEvenNegative(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                if(arr[i] % 2 == 0) {
                    result += arr[i];
                }
            }
        }
        System.out.println("Сумма нечетных отрицательных элментов равна = " + result);
    }

    public static void positive(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                count ++;
            }
        }
        System.out.println("Количество положительных элементов равно = " + count);
    }

    public static void arithmetic(int[] arr) {
        int summa = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                summa += arr[i];
                count ++;
            }
        }
        double result = summa / count;
        System.out.println("Среднее арифметическое отрицательных элементов равно = " + result);

    }

    public static void main(String[] args) {
        int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        max(array);
        summaPositive(array);
        summaEvenNegative(array);
        positive(array);
        arithmetic(array);
    }
}
