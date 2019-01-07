package ru.itpark;

import java.util.Scanner;

//Пусть есть последовательность (a1...aN), N->infinity, aN = -1
//Необходимо посчитать произведение входных позиций чисел, у которых сумма цифр - простое число.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt(); //Текущее число
        int currentDigit = 0;
        int compositionofNum = 1;
        int PositionNumber = 1;
        int SummNumbers = 0; //Сумма Чисел
        while (currentNumber != -1) {
            //Считаем сумму цифр числа
            int digitSum = 0;
            while (currentNumber != 0) {
                System.out.println("number =" + currentNumber);
                currentDigit = currentNumber % 10;
                digitSum = digitSum + currentDigit;
                System.out.println("digitSum =" + digitSum);
                currentNumber = currentNumber / 10;
            }
            // определяем простое число или нет
            for (int divider = 2; divider * divider <= digitSum; divider++) {
                //System.out.println("For divider = " + divider);
                if (digitSum % divider != 0) {
                    System.out.println("Prime");

                    //считаем произведение входных позиций чисел
                    compositionofNum = compositionofNum * PositionNumber;
                    PositionNumber++;
                }
                currentNumber = scanner.nextInt();
            }
            System.out.println("compositionofNum = " + compositionofNum);

        }
    }
}