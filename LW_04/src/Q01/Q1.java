package Q01;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2=scanner.nextInt();
        System.out.println("Enter the third number:");
        int num3=scanner.nextInt();

        int smallest=num1;
                if  (num2<smallest){
                    smallest=num2;
                }
                if (num3<smallest){
                    smallest=num3;
                }
        System.out.println("Smallest number is "+ smallest);
    }

}
