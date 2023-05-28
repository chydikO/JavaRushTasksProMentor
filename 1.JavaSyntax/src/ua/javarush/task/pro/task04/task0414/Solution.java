package ua.javarush.task.pro.task04.task0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Хорошого забагато не буває
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int number = scanner.nextInt();
        if (number > 0 && number < 5) {
            int count = 0;
            do {
                System.out.println(word);
                count++;
            } while (count < number);
        } else {
            System.out.println(word);
        }
    }
}