package Q_11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length < 2) {
            System.out.println("Invalid input. Please enter a first, middle (optional), and last name.");
        } else {
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length - 1];
            String middleInitial = nameParts.length > 2 ? nameParts[1].charAt(0) + "." : "";

            System.out.println(lastName + ", " + firstName + " " + middleInitial);
        }

        scanner.close();
    }
}


