package Q_04;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the bodyweight in pounds: ");
        double bodyweight=scanner.nextDouble();

        double calories=bodyweight*19;
        System.out.println("Number of calories the person needs in one day: "+calories);

    }

}
