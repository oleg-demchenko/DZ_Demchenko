package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Demchenko on 20.10.2016.
 */
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vvod = scanner.nextLine();
        String parol = "Oleg0535";
        if (vvod.equals(parol))

            System.out.println("Строки равны");
        else
            System.out.println("Строки не равны");
    }
}
