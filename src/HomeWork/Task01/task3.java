package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Demchenko on 20.10.2016.
 */
public class task3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] name = scanner.nextLine().split(" ");

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        System.out.print("\n");

        for (String g : name) {
            System.out.print(g + " ");
        }
    }
}
