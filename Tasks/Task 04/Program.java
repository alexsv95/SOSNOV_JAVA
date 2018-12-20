package com.company;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 4, 15, 40};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}