package Q_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the inner circle radius: ");
        double innerRadius=scanner.nextDouble();

        System.out.println("Enter the outer circle radius: ");
        double outerRadius=scanner.nextDouble();

        Circle innerCircle=new Circle(innerRadius);
        Circle outerCircle=new Circle(outerRadius);

        double area=outerCircle.computeArea()-innerCircle.computeArea();
        System.out.println("The area is "+area);
    }
}
