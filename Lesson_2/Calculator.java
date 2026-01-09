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
            case '^' -> Math.pow(firstNumber, secondNumber);
            case '%' -> firstNumber % secondNumber;
            default -> {
                System.out.println("Ошибка: операция '" + operation + "' не поддерживается");
                yield Double.NaN;
            }
        };
    }
}