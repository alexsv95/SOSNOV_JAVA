package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Currency;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int digitSum = 0;
        int currentDigit;
        while (number !=0) {
            //System.out.println("number =" + number);
            currentDigit = number % 10;
            //Sys1tem.out.println("currentDigit =" + currentDigit);
            digitSum = digitSum + currentDigit;
            System.out.println("digits sum =" + digitSum);
            number = number / 10;
        }
        for (int divider = 2; divider * divider <= digitSum; divider++) {
            System.out.println("For divider = " + divider);
            if (digitSum % divider == 0) {
                System.out.println("Not prime");
                return;
            }
            System.out.println("Bad divider");
        }

        System.out.println("Prime");
    }
}