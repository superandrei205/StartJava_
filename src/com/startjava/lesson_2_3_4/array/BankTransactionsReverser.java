package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionsReverser {
    public static void main(String[] args) {
        int[] transactions = new int[0];
        int[] reversed = reverse(transactions);
        printReport(transactions, reversed);

        transactions = null;
        reversed = reverse(transactions);
        printReport(transactions, reversed);

        transactions = new int[]{5};
        reversed = reverse(transactions);
        printReport(transactions, reversed);

        transactions = new int[]{6, 8, 9, 1};
        reversed = reverse(transactions);
        printReport(transactions, reversed);

        transactions = new int[]{13, 8, 5, 3, 2, 1, 1};
        reversed = reverse(transactions);
        printReport(transactions, reversed);
    }

    public static int[] reverse(int[] transactions) {
        if (transactions == null) {
            return null;
        }

        int length = transactions.length;
        int[] reversed = new int[length];
        for (int i = 0, j = length - 1; i < length; i++, j--) {
            reversed[i] = transactions[j];
        }
        return reversed;
    }

    public static void printReport(int[] original, int[] reversed) {
        if (original == null) {
            System.out.println("""
                                Ошибка в данных: массив транзакций = null. Допустимо: массив целых чисел
                                (в том числе длины 0).
                                """);
            return;
        }

        int length = original.length;
        if (length == 0) {
            System.out.println("Нет данных о транзакциях: массив пуст (длина = 0).");
            System.out.println("Исходные транзакции: " + Arrays.toString(original));
            System.out.println(" В обратном порядке: " + Arrays.toString(reversed));
            System.out.println();
            return;
        }

        System.out.println("Исходные транзакции: " + Arrays.toString(original));
        System.out.println(" В обратном порядке: " + Arrays.toString(reversed));
        System.out.println();
    }
}