public class GuessNumber {
    private int secretNumber;

    public GuessNumber() {
        this.secretNumber = (int) (Math.random() * 100) + 1;
    }

    public boolean isCorrect(int guess) {
        return guess == secretNumber;
    }

    public boolean isLess(int guess) {
        return guess < secretNumber;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void createNewNumber() {
        this.secretNumber = (int) (Math.random() * 100) + 1;
    }
}