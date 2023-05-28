package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        multiArray = new int [a][];

        for(int i = 0; i < multiArray.length; i++){
            int x = s.nextInt();
            multiArray[i] = new int[x];
            for(int j = 0; j < multiArray[i].length; j++){
                System.out.print(multiArray[i][j]);
            };
        }System.out.println();
    }
}