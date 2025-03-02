package Q_03;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First Name:");
        String firstName=scanner.nextLine();
        System.out.println("Enter the Middle Name:");
        String middleName=scanner.nextLine();
        System.out.println("Enter the Last Name:");
        String lastName=scanner.nextLine();
        String initial=middleName.substring(0,1);

        System.out.println("Full name is:"+firstName+" "+initial+"."+lastName);
    }
}
