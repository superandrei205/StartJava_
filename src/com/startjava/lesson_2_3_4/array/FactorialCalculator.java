package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        int[] testData = {};
        String[] expressions = computeExpressions(testData);
        printReport(expressions);

        testData = null;
        expressions = computeExpressions(testData);
        printReport(expressions);

        testData = new int[]{-5};
        expressions = computeExpressions(testData);
        printReport(expressions);

        testData = new int[]{7, 0, 21};
        expressions = computeExpressions(testData);
        printReport(expressions);

        testData = new int[]{1, 20, 5, -3};
        expressions = computeExpressions(testData);
        printReport(expressions);
    }

    public static String[] computeExpressions(int... numbers) {
        if (numbers == null) {
            return new String[]{"""
                                Ошибка: входной массив = null
                                """};
        }

        int length = numbers.length;
        if (length == 0) {
            return new String[]{"""
                                Нет данных для вычисления: массив пуст (длина = 0)
                                """};
        }

        String[] expressions = new String[length];
        for (int i = 0; i < length; i++) {
            expressions[i] = formatExpression(numbers[i]);
        }
        return expressions;
    }

    public static String formatExpression(int n) {
        if (n < 0) {
            return "Ошибка: факториал " + n + "! не определен";
        }

        if (n > 20) {
            return "Ошибка: факториал " + n + "! слишком велик (максимум 20!)";
        }

        long factorialValue = calculateFactorial(n);
        StringBuilder builder = new StringBuilder();
        builder.append(n).append("! = ");

        boolean isTrivial = n <= 1 ? true : false;
        if (isTrivial) {
            builder.append(factorialValue);
        } else {
            for (int i = 1; i <= n; i++) {
                builder.append(i);
                builder.append(i < n ? " * " : " = ");
            }
            builder.append(factorialValue);
        }

        return builder.toString();
    }

    public static long calculateFactorial(int n) {
        long value = 1;
        for (int i = 2; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    public static void printReport(String... expressions) {
        for (String expression : expressions) {
            System.out.println(expression);
        }
        System.out.println();
    }
}