package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Demchenko on 26.10.2016.
 */
public class task6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int l = in.nextInt();
        int[] arr = new int[l];
        System.out.println("Введите масив");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 3;
            if (a == 0)
                System.out.println("Делится на 3: " + arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 9;
            if (a == 0)
                System.out.print("Делится на 9: " + arr[i]);
        }
    }
}




