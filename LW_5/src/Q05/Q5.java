package Q05;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scanner.nextLine();

        if(isPalindrome(word)){
            System.out.println("The given word is palindrome");
        } else {
            System.out.println("The given word is not palindrome");
        }
    }

    public static boolean isPalindrome(String word){
        String reverseWord="";
        for (int i=word.length()-1;i>=0;i-- ){
            reverseWord=reverseWord+word.charAt(i);
        }
        return word.equals(reverseWord);
    }


}
