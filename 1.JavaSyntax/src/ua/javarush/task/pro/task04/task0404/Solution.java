package ua.javarush.task.pro.task04.task0404;

/* 
Заповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int high = 5;
        int width = 10;

        while (high-- > 0) {
            while (width-- > 0) {
                System.out.print("Q");
            }
            System.out.println();
            width = 10;
        }

    }
}