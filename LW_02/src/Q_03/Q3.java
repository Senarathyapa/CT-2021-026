package Q_03;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter temperature in degrees celcius: ");
        int celcius=scanner.nextInt();

        double result=1.8*celcius+32;
        System.out.println("Temparature in degrees faranheit: "+result);


    }
}
