import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private int secretNumber;

    public GuessNumber(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
        generateSecretNumber();
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
    }

    public void play(Scanner scanner) {
        while (true) {
            if (tryPlayerGuess(player1, scanner)) return;
            if (tryPlayerGuess(player2, scanner)) return;
        }
    }

    private boolean tryPlayerGuess(Player player, Scanner scanner) {
        System.out.print(player.getName() + ", введите число от 1 до 100: ");
        int guess = scanner.nextInt();
        if (guess == secretNumber) {
            System.out.println("Победил " + player.getName() + "!");
            return true;
        }
        giveHint(guess);
        return false;
    }

    private void giveHint(int guess) {
        if (guess < secretNumber) {
            System.out.println("Загаданное число больше.");
        } else {
            System.out.println("Загаданное число меньше.");
        }
    }
}