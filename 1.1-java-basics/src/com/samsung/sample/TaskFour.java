package com.samsung.sample;

import java.util.Random;
import java.util.Scanner;

public class TaskFour {

    /**
     * Задача - Написать игру в 21
     * <p>
     * Алгоритм - Игроку выдается 2 карт, далее он может взять еще одну, а может сказать что ему хватит.
     * <p>
     * И так сколько угодно раз, пока у него <= 21 в сумме на руках. Далее, если он еще не проиграл, идет игра против компьютера.
     * <p>
     * Компьютер тянет карты, пока у него есть возможность победить игрока и:
     * - либо компьютер побеждает (игрок < компьютер <= 21)
     * - либо компьютер проигрывает (игрок <= 21 < компьютер)
     * - либо ничья (игрок == компьютер == 21)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int[] cards = new int[]{
                2, 3, 4, 5, 6, 7, 8, 9, 10,
                2, 3, 4, 5, 6, 7, 8, 9, 10,
                2, 3, 4, 5, 6, 7, 8, 9, 10,
                2, 3, 4, 5, 6, 7, 8, 9, 10,
                10, 10, 10,
                10, 10, 10,
                10, 10, 10,
                10, 10, 10,
                11, 11, 11, 11,
        };
        for (int i = 0; i < r.nextInt(1000); i++) {
            int randPosition = r.nextInt(cards.length);
            int randValue = cards[randPosition];

            int pos = i % cards.length;

            cards[randPosition] = cards[pos];
            cards[pos] = randValue;
        }

        int playerSum = cards[0] + cards[1];
        int computerSum = 0;

        System.out.println(cards[0] + " " + cards[1]);

        while (true) {
            System.out.println("Type Y/N.");
            char choice = scanner.next().charAt(0);
            if (choice == 'Y') {
                for (int i = 0; i < cards.length; i++) {
                    if (cards[i] != 0) {
                        playerSum += cards[i];
                        System.out.println(cards[i]);
                        cards[i] = 0;
                        break;
                    }
                }
                if (playerSum > 21) {
                    break;
                }
            } else if (choice == 'N') {
                break;
            } else {
                System.out.println("Unknown option");
            }
        }

        if (playerSum > 21) {
            System.out.println("You lose, " + playerSum + " is more than 21.");
        } else {
            System.out.println("Computer ");
            while (computerSum < 21 && computerSum <= playerSum) {
                for (int i = 0; i < cards.length; i++) {
                    if (cards[i] != 0) {
                        computerSum += cards[i];
                        System.out.print(cards[i]+" ");
                        cards[i] = 0;
                        break;
                    }
                }

                if (computerSum == playerSum && playerSum == 21) {
                    break;
                }
            }
            System.out.println();

            if (computerSum > 21) {
                System.out.println("You win!");
            } else if (computerSum == 21) {
                if (playerSum == 21) {
                    System.out.println("Draw!");
                } else {
                    System.out.println("You lose!");
                }
            } else {
                System.out.println("You lose!");
            }
        }


//        System.out.println(Arrays.toString(cards));


//        int N = scanner.nextInt();
//        char symbol = '^';
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N - i - 1; j++) {
//                System.out.print('|');
//            }
//            for (int j = N / 2 - i; j <= N / 2 + i; j++) {
//                System.out.print(symbol);
//            }
//            for (int j = 0; j < N - i - 1; j++) {
//                System.out.print('|');
//            }
//            System.out.println();
//        }

    }
}
