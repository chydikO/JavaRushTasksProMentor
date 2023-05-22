package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String data = "";

        int sum = 0;
        while (true) {
            data = scanner.nextLine();
            if (data.equals("ENTER")) break;
            sum += Integer.valueOf(data);
        }
        System.out.println(sum);
    }
}