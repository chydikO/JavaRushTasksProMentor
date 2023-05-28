package ua.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            if (array.length % 2 == 0) {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }
        } else {
            System.out.println("end");
        }
    }
}
