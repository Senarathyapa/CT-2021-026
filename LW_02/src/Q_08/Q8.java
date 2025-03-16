package Q_08;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double PI=3.14;


        System.out.println("Enter the radius(r): ");
        double r=scanner.nextDouble();

        double volume=(4.0/3)*(PI *Math.pow(r,3));
        System.out.println("Volume is: "+volume);


    }
}
