import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            calculator.setOperation(scanner.nextLine().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());
            scanner.nextLine();

            double answer = calculator.calculate();
            printAnswer(answer);

            String response;
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                response = scanner.nextLine().trim().toLowerCase();
            } while (!response.equals("yes") && !response.equals("no"));

            if (response.equals("no")) {
                System.out.println("До свидания!");
                break;
            }
        } while (true);

        scanner.close();
    }

    private static void printAnswer(double result) {
        if (!Double.isNaN(result)) {
            System.out.println("Ответ: " + result);
        }
    }
}