import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        while (guess != randomNumber) {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }

        scanner.close();
    }
}
