package ua.javarush.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Шукаємо максимум
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int result = 0;
        result = (numberA > numberB) ? numberA : numberB;

        System.out.println(result);
    }
}
