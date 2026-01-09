import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine().trim();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine().trim();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber();

        boolean continueGame = true;
        while (continueGame) {
            System.out.println("\nКомпьютер загадал число от 1 до 100. Удачи!");

            boolean guessed = false;
            while (!guessed) {
                guessed = makeTurn(scanner, player1, game);
                if (!guessed) {
                    guessed = makeTurn(scanner, player2, game);
                }
            }

            continueGame = askToContinue(scanner);
            if (continueGame) {
                game.createNewNumber();
            }
        }

        System.out.println("Спасибо за игру!");
        scanner.close();
    }

    private static boolean makeTurn(Scanner scanner, Player player, GuessNumber game) {
        int number = enterNumber(scanner, player);
        player.setNumber(number);

        if (game.isCorrect(number)) {
            System.out.println("Поздравляем, " + player.getName() +
                    "! Вы угадали число: " + game.getSecretNumber());
            return true;
        } else {
            System.out.println(game.isLess(number) ? "Больше!" : "Меньше!");
            return false;
        }
    }

    private static int enterNumber(Scanner scanner, Player player) {
        while (true) {
            System.out.print(player.getName() + ", введите число от 1 до 100: ");
            String input = scanner.nextLine().trim();

            try {
                int number = Integer.parseInt(input);
                if (number >= 1 && number <= 100) {
                    return number;
                }
                System.out.println("Число должно быть в диапазоне [1, 100]. Попробуйте снова.");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }
    }

    private static boolean askToContinue(Scanner scanner) {
        while (true) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if ("yes".equals(answer)) {
                return true;
            }
            if ("no".equals(answer)) {
                return false;
            }
            System.out.println("Пожалуйста, введите 'yes' или 'no'.");
        }
    }
}