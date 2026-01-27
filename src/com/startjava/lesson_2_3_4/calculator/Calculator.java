package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private char operation;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        if (secondNumber == 0 && (operation == '/' || operation == '%')) {
            System.out.println("Ошибка: деление на ноль запрещено");
            return Double.NaN;
        }

        return switch (operation) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> (double) firstNumber / secondNumber;
            case '^' -> pow(firstNumber, secondNumber);
            case '%' -> firstNumber % secondNumber;
            default -> {
                System.out.println("Ошибка: операция '" + operation + "' не поддерживается");
                yield Double.NaN;
            }
        };
    }

    private static double pow(int base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }

        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("0 cannot be raised to a negative power");
        }

        return exponent > 0 ? base * pow(base, exponent - 1) : 1.0 / pow(base, -exponent);
    }
}