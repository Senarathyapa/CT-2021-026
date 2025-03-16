package Q_07;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight in kilograms(W): ");
        int W=scanner.nextInt();
        System.out.println("Enter the height in centimeters(H): ");
        int H=scanner.nextInt();

        double BMI=(Double)(W/Math.pow((H/100.0),2));

        if (BMI>=20 && BMI<=25) {
            System.out.println("Your BMI is within the normal range.");
        }else if(BMI<20){
            System.out.println("You are underweight.");
        }else{
            System.out.println("You are overweight.");
        }

        System.out.println("BMI value: "+BMI);





    }
}
