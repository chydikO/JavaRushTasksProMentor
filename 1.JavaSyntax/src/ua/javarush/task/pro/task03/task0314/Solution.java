package ua.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Поламана клавіатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();
        if (inputString.equals(secret.toLowerCase())) {
            System.out.println("доступ дозволено");
        } else {
            System.out.println("доступ заборонено");
        }
        //напишіть тут ваш код
    }
}
