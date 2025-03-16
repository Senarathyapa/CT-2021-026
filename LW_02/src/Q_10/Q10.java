package Q_10;

import java.util.Scanner;
public class Q10 {
    public static final int MONTHS_IN_YEAR=12;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter loan amount: ");
        double loanAmount=scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double annualInterest=scanner.nextDouble();

        System.out.println("Enter loan period(year): ");
        int loanperiod=scanner.nextInt();

        double monthlyInterest=annualInterest/100.0/MONTHS_IN_YEAR;
        int numberOfPayments = loanperiod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterest) /
                (1 - Math.pow(1 / (1 + monthlyInterest), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);




    }
}
