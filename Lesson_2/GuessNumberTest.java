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

        GuessNumber game = new GuessNumber(player1, player2);
        game.startGame();

        scanner.close();
    }
}