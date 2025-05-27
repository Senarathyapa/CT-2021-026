package Q02;
import java.util.Scanner;
public class Q2 {
        public static int countDigits(int number) {
            if (number == 0) {
                return 1;
            }

            int count = 0;
            while (number != 0) {
                number = number / 10;
                count++;
            }
            return count;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int input;


            while (true) {
                System.out.print("Enter a number (negative to stop): ");
                input = scanner.nextInt();

                if (input < 0) {
                    System.out.println("Negative number entered. Program stopped.");
                    break;
                }

                int digits = countDigits(input);
                System.out.println("Number of digits in " + input + " is: " + digits);
            }

            scanner.close();
        }
    }


