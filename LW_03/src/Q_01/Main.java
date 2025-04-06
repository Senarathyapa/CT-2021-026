package Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter the Temperature in Celsius: ");
        // double celsius = scanner.nextDouble();

        System.out.println("Enter the Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        //Temperature temp = new Temperature();
        //temp.setCelsius(celsius);
        //System.out.println("The celsius convert into fahrenheit: " + temp.toFahrenheit());

        Temperature temp = new Temperature();
        temp.setFahrenheit(fahrenheit);
        System.out.println("The fahrenheit convert to celsius: " + temp.toCelsius());
    }
}