package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionsReverser {
    public static void main(String[] args) {
        int[] transactions;
        int[] reversed;

        transactions = new int[0];
        reversed = reverse(transactions);
        printResult(transactions, reversed);

        transactions = null;
        reversed = reverse(transactions);
        printResult(transactions, reversed);

        transactions = new int[]{5};
        reversed = reverse(transactions);
        printResult(transactions, reversed);

        transactions = new int[]{6, 8, 9, 1};
        reversed = reverse(transactions);
        printResult(transactions, reversed);

        transactions = new int[]{13, 8, 5, 3, 2, 1, 1};
        reversed = reverse(transactions);
        printResult(transactions, reversed);
    }

    public static int[] reverse(int[] transactions) {
        if (transactions == null) {
            return null;
        }

        int[] reversedArray = new int[transactions.length];
        for (int i = 0; i < transactions.length; i++) {
            reversedArray[i] = transactions[transactions.length - 1 - i];
        }
        return reversedArray;
    }

    public static void printResult(int[] original, int[] reversed) {
        if (original == null) {
            System.out.printf(
                    "%s %s%n%n",
                    "Ошибка в данных: массив транзакций = null.",
                    "Допустимо: массив целых чисел (в том числе длины 0)."
            );
            return;
        }

        if (original.length == 0) {
            System.out.println("Нет данных о транзакциях: массив пуст (длина = 0).");
            System.out.println("Исходные транзакции: []");
            System.out.println("В обратном порядке: []");
            System.out.println();
            return;
        }

        System.out.println("Исходные транзакции: " + Arrays.toString(original));
        System.out.println("В обратном порядке: " + Arrays.toString(reversed));
    }
}