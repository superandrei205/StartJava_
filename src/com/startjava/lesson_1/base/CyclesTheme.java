package com.startjava.lesson_1.base;

import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1: ВЫВОД ASCII-СИМВОЛОВ");
        System.out.printf("%s %11s %13s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i <= 122; i++) {
            if (((i <= '0') && (i % 2 != 0)) || ((i >= 'a') && (i % 2 == 0))) {
                System.out.printf("%4d%11c%12s%s%n", i, i, "", Character.getName(i));
            }
        }

        System.out.println("\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int row = 1; row < 6; row++) {
            System.out.print("---------- ");
            for (int i = row; i < 6; i++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int i = 1; i <= row * 2 - 1; i++) {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println("\n3: ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.print("  |");
        for (int col = 2; col <= 9; col++) {
            System.out.printf("%3d", col);
        }
        System.out.println("\n--+------------------------");

        for (int row = 2; row <= 9; row++) {
            System.out.printf("%d |", row);
            for (int col = 2; col <= 9; col++) {
                int product = row * col;
                System.out.printf("%3d", product);
            }
            System.out.println();
        }

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int size = 5;
        int maxNum = 24;

        for (int i = 1; i < maxNum; ) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", (i < maxNum ? i : 0));
                i += 2;
            }
            System.out.println();
        }

        System.out.println("\n5: ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX");
        int a = 10;
        int b = -1;
        int c = 5;
        int max = a;
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;

        if (b > max) max = b;
        if (c > max) max = c;

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n6: РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");
        int originalNumber = 2234321;
        int reversedNumber = 0;
        int currentNumber = originalNumber;
        int countTwos = 0;

        while (currentNumber > 0) {
            int digit = currentNumber % 10;
            if (digit == 2) countTwos++;
            reversedNumber = reversedNumber * 10 + digit;
            currentNumber /= 10;
        }

        boolean isPalindrome = originalNumber == reversedNumber;
        String palindromeStatus = isPalindrome ? "палиндром" : "не палиндром";
        String parity = (countTwos % 2 == 0) ? "четным" : "нечетным";

        System.out.printf("%d - %s с %s (%d) количеством двоек%n",
                reversedNumber, palindromeStatus, parity, countTwos);

        System.out.println("\n7: ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА");
        originalNumber = 101002;
        int firstHalf = originalNumber % 1000;
        int secondHalf = originalNumber / 1000;
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        while (secondHalf > 0) {
            firstHalfSum += firstHalf % 10;
            firstHalf /= 10;
            secondHalfSum += secondHalf % 10;
            secondHalf /= 10;
        }

        String luckyStatus = firstHalfSum == secondHalfSum ? "счастливое число" : "не счастливое число";

        System.out.printf("%d - %s%n", originalNumber, luckyStatus);
        System.out.printf("Сумма цифр %03d = %d%n", originalNumber % 1000, firstHalfSum);
        System.out.printf("Сумма цифр %03d = %d%n", originalNumber / 1000, secondHalfSum);

        System.out.println("\n8: ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ");
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        for (int i = 0; i < 8; i++) {
            char ch = (char) random.nextInt(33, 127);
            password.append(ch);
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        String strength = "Слабый";
        if (password.length() >= 8 && hasUpper && hasDigit && hasSpecial) {
            strength = "Надёжный";
        } else if (password.length() >= 8 && (hasUpper || hasDigit)) {
            strength = "Средний";
        }

        System.out.println("Пароль: " + password);
        System.out.println("Надежность: " + strength);
    }
}