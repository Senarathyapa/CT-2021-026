package Q_09;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter invest dollar: ");
        double P=scanner.nextDouble();
        System.out.println("Enter annual percent interest: ");
        double R=scanner.nextDouble();
        System.out.println("Enter the No of years: ");
        double N=scanner.nextDouble();

        double amount=P*(1+Math.pow((R/100),N));
        System.out.println("Amount is: "+amount);

    }
}
