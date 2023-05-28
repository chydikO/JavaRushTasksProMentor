package ua.javarush.task.pro.task05.task0507;

import java.util.Arrays;
import java.util.Scanner;

/* 
Максимальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        array=new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}
