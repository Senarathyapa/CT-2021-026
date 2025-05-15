package Q02;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between(0-4):");
        int number=scanner.nextInt();
        String color;
        switch(number){
            case 0:
                color="Magenta";
                break;
            case 1:
                color="cyan";
                break;
            case 2:
                color="Red";
                break;
            case 3:
                color="Blue";
                break;
            case 4:
                color="Green";
                break;
            default:
                color=null;
                break;
        }
        if(color==null){
            System.out.println("invalid selection");
        }else{
            System.out.println("You are selected "+color);
        }



    }
}
