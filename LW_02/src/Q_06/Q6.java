package Q_06;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the born year: ");
        int bornyear=scanner.nextInt();

        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
        int age=Integer.parseInt(sdf.format(date))-bornyear;
        System.out.println("You were born in "+bornyear+" and will be (are) "+age+" this year");



    }
}
