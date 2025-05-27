package Q03;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number to print its multiplication table: ");
            int N = scanner.nextInt();

            System.out.println("Multiplication Table for " + N + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }

            scanner.close();
        }
    }


