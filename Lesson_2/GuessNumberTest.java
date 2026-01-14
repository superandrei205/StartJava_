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

        String answer;
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play(scanner);

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine().trim().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

        System.out.println("Спасибо за игру!");
        scanner.close();
    }
}