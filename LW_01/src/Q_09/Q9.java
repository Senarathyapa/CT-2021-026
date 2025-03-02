package Q_09;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Write a sentence:");
        String sentence=scanner.nextLine();

        System.out.println(sentence.length());
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));

    }
}
