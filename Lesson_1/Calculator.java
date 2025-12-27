public class Calculator {
    public static void main(String[] args) {
        int operand1 = 2;
        int operand2 = 10;
        char operator = '^';

        if (operand1 < 1 || operand2 < 1) {
            System.out.println("Ошибка: оба операнда должны быть натуральными числами (≥ 1).");
            return;
        }

        int result = 0;

        if (operator == '+') {
            result = operand1 + operand2;
        } else if (operator == '-') {
            result = operand1 - operand2;
        } else if (operator == '*') {
            result = operand1 * operand2;
        } else if (operator == '/') {
            if (operand2 == 0) {
                System.out.println("Ошибка: деление на ноль.");
                return;
            }
            result = operand1 / operand2;
        } else if (operator == '^') {
            if (operand2 == 0) {
                result = 1;
            } else {
                int power = 1;
                for (int i = 0; i < operand2; i++) {
                    power *= operand1;
                }
                result = power;
            }
        } else if (operator == '%') {
            if (operand2 == 0) {
                System.out.println("Ошибка: деление по модулю на ноль.");
                return;
            }
            result = operand1 % operand2;
        }

        System.out.printf("%d %c %d = %d%n", operand1, operator, operand2, result);
    }
}