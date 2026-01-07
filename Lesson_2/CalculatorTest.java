import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operator = scanner.nextLine().charAt(0);

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            scanner.nextLine();

            calculator.setFirstNumber(firstNumber);
            calculator.setOperation(operator);
            calculator.setSecondNumber(secondNumber);

            double result = calculator.calculate();

            if (!Double.isNaN(result)) {
                System.out.println("Результат: " + result);
            }

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String answer = scanner.nextLine().trim().toLowerCase();

            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
                answer = scanner.nextLine().trim().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("До свидания!");
                break;
            }
        }

        scanner.close();
    }
}