import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        do {
            secretNumber = (int) (Math.random() * 100) + 1;
            System.out.println("\nКомпьютер загадал число от 1 до 100. Удачи!");

            boolean guessed = false;
            while (!guessed) {
                guessed = checkNumber(player1);
                if (!guessed) {
                    guessed = checkNumber(player2);
                }
            }
        } while (askRestart());
    }

    private boolean checkNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число от 1 до 100: ");
        int guess;
        try {
            guess = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Ошибка: введите целое число.");
            scanner.nextLine();
            return false;
        }

        if (guess < 1 || guess > 100) {
            System.out.println("Число должно быть в диапазоне [1, 100]. Ход пропущен.");
            return false;
        }

        player.setNumber(guess);

        if (guess == secretNumber) {
            System.out.println("Поздравляем, " + player.getName() + "! Вы угадали число: " + secretNumber);
            return true;
        } else if (guess < secretNumber) {
            System.out.println("Больше!");
        } else {
            System.out.println("Меньше!");
        }
        return false;
    }

    private boolean askRestart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите продолжить игру? [yes/no]: ");
        String answer = scanner.nextLine().trim().toLowerCase();

        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.print("Пожалуйста, введите 'yes' или 'no': ");
            answer = scanner.nextLine().trim().toLowerCase();
        }

        return answer.equals("yes");
    }
}