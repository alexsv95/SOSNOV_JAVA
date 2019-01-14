package ru.itpark;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {4, 1, 15, 11, 30};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        
        for (int i = 0; i < 5; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент массива = " + max);
        System.out.println("Минимальный элемент массива = " + min);
    }
}
