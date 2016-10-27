package HomeWork.Task01;


import java.util.Scanner;

/**
 * Created by Demchenko on 20.10.2016.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for (int i = name.length() - 1; i >= 0; --i) {
            System.out.print(name.charAt(i));
        }
    }
}

