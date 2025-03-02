package Q_08;
import java.util.Scanner;
public class Q8 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the Sentence :");
            String word=scanner.nextLine();

            String[] sentence=word.split("!");
            for (String sentences:sentence){
                System.out.println(sentences);
            }


        }
    }

