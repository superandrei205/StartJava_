package com.startjava.lesson_2_3_4.array;

public class BankTransactionsReverse {
    public static void main(String[] args) {
        int[] zeroLength = new int[0];
        int[] nullArray = null;

        int[] single = {5};
        int[] four = {6, 8, 9, 1};
        int[] seven = {13, 8, 5, 3, 2, 1, 1};

        printTransactionReverse(zeroLength);
        printTransactionReverse(nullArray);
        printTransactionReverse(single);
        printTransactionReverse(four);
        printTransactionReverse(seven);
    }

    public static void printTransactionReverse(int[] transactions) {
        if (transactions == null) {
            System.out.printf(
                    "%s %s%n",
                    "Ошибка в данных: массив транзакций = null.",
                    "Допустимо: массив целых чисел (в том числе длины 0)."
            );
            return;
        }

        if (transactions.length == 0) {
            System.out.printf(
                    "%s%n%s%n%s%n",
                    "Нет данных о транзакциях: массив пуст (длина = 0).",
                    "Исходные транзакции: []",
                    "В обратном порядке: []"
            );
            return;
        }

        int[] reversed = reverseCopy(transactions);

        System.out.println("Исходные транзакции: " + formatArray(transactions));
        System.out.println("В обратном порядке: " + formatArray(reversed));
    }

    public static int[] reverseCopy(int[] source) {
        if (source == null) {
            return null;
        }

        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[source.length - 1 - i];
        }
        return result;
    }

    public static String formatArray(int[] array) {
        if (array == null) {
            return "null";
        }

        StringBuilder builder = new StringBuilder();
        builder.append('[');

        int index = 0;
        for (int value : array) {
            builder.append(value);
            if (index < array.length - 1) {
                builder.append(", ");
            }
            index++;
        }

        builder.append(']');
        return builder.toString();
    }
}
