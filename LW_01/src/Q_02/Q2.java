package Q_02;
import javax.swing.*;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your First Name :");
        String firstName=scanner.nextLine();
        System.out.println("Enter your Last Name :");
        String lastName=scanner.nextLine();

        JFrame frame=new JFrame();
        frame.setSize(500,300);
        frame.setTitle(firstName+" "+lastName);
        frame.setVisible(true);
    }

}
