package Q_05;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter temperature in degrees fahrenheit: ");
        double fahrenheit=scanner.nextDouble();

        double celsius=(fahrenheit-32)*5/9;
        System.out.println("Temperature in degrees celsius: "+celsius);

    }
}
