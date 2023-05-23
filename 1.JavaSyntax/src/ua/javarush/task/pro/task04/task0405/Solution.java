package ua.javarush.task.pro.task04.task0405;

/* 
Незаповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 20) {
                if (i == 0 || i == 9 || j == 0 || j == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}