package ua.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Мінімальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner sc = new Scanner(System.in);
        int countNum = sc.nextInt();
        array = new int[countNum];
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        System.out.println(minNum);
    }
}
