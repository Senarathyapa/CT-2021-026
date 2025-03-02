package Q_07;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
public class Q7 {
    public static void main(String[] args) {
       Date today=new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");

        JFrame frame=new JFrame();
        frame.setTitle(sdf.format(today));
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
