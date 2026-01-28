package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        processAndPrint();
        processAndPrint((int[]) null);
        processAndPrint(-5);
        processAndPrint(7, 0, 21);
        processAndPrint(1, 20, 5, -3);
    }

    public static void processAndPrint(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: входной массив = null");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("Нет данных для вычисления: массив пуст (длина = 0)");
            return;
        }

        String[] results = calculateFactorialExpressions(numbers);
        for (String result : results) {
            System.out.println(result);
        }
        System.out.println();
    }

    public static String[] calculateFactorialExpressions(int... numbers) {
        String[] expressions = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            expressions[i] = formatFactorialExpression(numbers[i]);
        }
        return expressions;
    }

    public static String formatFactorialExpression(int n) {
        StringBuilder builder = new StringBuilder();
        builder.append(n).append("!");

        if (n < 0) {
            builder.setLength(0);
            builder.append("Ошибка: факториал ").append(n).append("! не определен");
            return builder.toString();
        }

        if (n > 20) {
            builder.setLength(0);
            builder.append("Ошибка: факториал ").append(n).append("! слишком велик (максимум 20!)");
            return builder.toString();
        }

        long fact = factorial(n);
        builder.append(" = ").append(fact);
        return builder.toString();
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}