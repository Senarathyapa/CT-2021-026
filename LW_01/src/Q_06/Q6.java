package Q_06;
import javax.swing.*;
import java.util.*;
public class Q6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the width (W):");
        int width=scanner.nextInt();
        System.out.println("Enter the height (H):");
        int height =scanner.nextInt();

        JFrame frame=new JFrame();
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
