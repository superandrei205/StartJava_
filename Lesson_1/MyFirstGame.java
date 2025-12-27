public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 73;
        int playerGuess = 1;

        System.out.println("ИГРА “УГАДАЙ ЧИСЛО”");
        System.out.println("Компьютер загадал число от 1 до 100. Игрок угадывает...");

        while (playerGuess != secretNumber) {
            if (playerGuess > secretNumber) {
                System.out.println(playerGuess + " больше того, что загадал компьютер");
            } else {
                System.out.println(playerGuess + " меньше того, что загадал компьютер");
            }
            playerGuess++;
        }

        System.out.println("Вы победили!");
    }
}
