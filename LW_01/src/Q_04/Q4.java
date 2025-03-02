package Q_04;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Q4 {
    public static void main(String[] args) {
        Date today=new Date();
        System.out.println(today);

        SimpleDateFormat sdf=new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(today));
    }
}
