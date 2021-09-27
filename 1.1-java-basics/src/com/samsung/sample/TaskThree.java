package com.samsung.sample;

import java.util.Scanner;

public class TaskThree {

    /**
     * Задача - для заданного N, нарисовать пирамиду из символов '^' высотой в N этажей
     * <p>
     * Пример - для числа 6 результат будет:
     * <pre>
     *          ^
     *         ^^^
     *        ^^^^^
     *       ^^^^^^^
     *      ^^^^^^^^^
     *     ^^^^^^^^^^^
     * </pre>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        char symbol = '^';

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print('|');
            }
            for (int j = N / 2 - i; j <= N / 2 + i; j++) {
                System.out.print(symbol);
            }
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print('|');
            }
            System.out.println();
        }

    }
}
