package ua.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Висока точність
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double epsilon = 0.000001d;

        if (Math.abs(number1 - number2) <= epsilon) {
            System.out.println("числа рівні");
        } else {
            System.out.println("числа не рівні");
        }
    }
}
