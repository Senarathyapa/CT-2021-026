package Q_02;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter values in centimetes: ");
        int value=scanner.nextInt();

        float outputinch= (float)(value/2.54);
        float outputfeet= (float)(outputinch/12);

        System.out.println("Value in inches: "+outputinch);
        System.out.println("Value in feet: "+outputfeet);

    }
}
