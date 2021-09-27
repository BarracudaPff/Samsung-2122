package com.samsung.sample;

import java.util.Scanner;

public class TaskTwo {

    /**
     * Задача - посчитать сумму цифр в числе (границы числа неизвестны)
     * <p>
     * Пример - для числа 12345 результат будет = 1+2+3+4+5 = 15
     * <p>
     * Алгоритм - Пока число не равно 0, суммируем последнюю цифру из числа
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number < 0) {
            number = number * -1;
        }

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("Сумма цифр = " + sum);
    }
}
