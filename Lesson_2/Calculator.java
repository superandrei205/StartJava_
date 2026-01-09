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

    public static double power(int base, int exponent) {
        if (base == 0 && exponent == 0) {
            return 1.0;
        }

        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("0 cannot be raised to a negative power");
        }

        if (exponent == 0) {
            return 1.0;
        }

        if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1.0 / power(base, -exponent);
        }
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
            case '^' -> power(firstNumber, secondNumber);
            case '%' -> firstNumber % secondNumber;
            default -> {
                System.out.println("Ошибка: операция '" + operation + "' не поддерживается");
                yield Double.NaN;
            }
        };
    }
}