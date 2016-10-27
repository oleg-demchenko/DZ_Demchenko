package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Demchenko on 26.10.2016.
 */
public class task6_3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        String s;
        s=in.nextLine();
        for ( int i=0;i<s.length();i++){
            Integer current = new Integer(s.charAt(i));
            if (current%3==0 | current%9==0){
                System.out.println("Число делится на rere: " + s.charAt(i));
            }
            if (current%9==0){
                System.out.println("Число делится на 9: " + s.charAt(i));
            }
        }
    }
}