package Q03;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the 10th power :");
        int pow=scanner.nextInt();
        String Number;
        switch(pow){
            case 6:
                Number="Million";
                break;
            case 9:
                Number="Billion";
                break;
            case 12:
                Number="Trillion";
                break;
            case 15:
                Number="Quadrallion";
                break;
            case 18:
                Number="Quintillion";
                break;
            case 21:
                Number="Sextillion";
                break;
            case 30:
                Number="Nonillion";
                break;
            case 100:
                Number="Googol";
                break;
            default:
                Number=null;
                break;
        }
        if(Number==null){
            System.out.println("invalid input");
        }else
            System.out.println("Your selection "+Number);

    }
}
