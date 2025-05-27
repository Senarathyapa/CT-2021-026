package Q06;
import java.util.Random;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int secretNumber=random.nextInt(100)+1;
        int guess;
        int attempts=0;

        System.out.println("Welcome to the number guessing game!");

        do {
            System.out.println("Enter your guess(1-100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Higher");
            } else if (guess < secretNumber) {
                System.out.println("Lower");
            } else {
                System.out.println("Congratulation! you gussed the secret number correct in " + attempts + " attempts");
            }
        }while(guess!=secretNumber);

    }
}
