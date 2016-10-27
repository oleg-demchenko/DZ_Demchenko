package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Demchenko on 20.10.2016.
 */
public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[10];
        int sum = 0;
        System.out.println("Введите 10 чисел:");
        for (int i = 0; mas.length > i; i++) {
            mas[i] = scanner.nextInt();
        }
        for (int num : mas) {
            sum = sum + num;
        }
        System.out.println("Сумма введенных 10 чисел:" + " " + sum);
    }
}
