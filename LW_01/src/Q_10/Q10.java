package Q_10;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Odd-number Word :");
        String a=scanner.nextLine();


        if (a.length()%2!=0) {
            int middleIndex=a.length()/2;
            System.out.println("Middle letter: "+a.charAt(middleIndex));
        }
         else{
             System.out.println("Please enter odd-length word ");
        }
        }
    }

