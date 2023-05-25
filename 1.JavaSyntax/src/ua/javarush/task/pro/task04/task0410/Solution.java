package ua.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Друге мінімальне число серед уведених
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int temp;
        int min1 = scanner.nextInt();
        int min2 = scanner.nextInt();

        if (min1 > min2) {
            temp = min1;
            min1 = min2;
            min2 = temp;
        }
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (min1 == min2) {
                if (number < min1) {
                    min1 = number;
                } else {
                    min2 = number;
                }
            }
            if (number < min1) {
                min2 = min1;
                min1 = number;
            } else if (number > min1 && number < min2) {
                min2 = number;
            }
        }
        System.out.println(min2);
        scanner.close();
    }
}