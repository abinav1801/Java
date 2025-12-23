import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String to Check for Palindrome :");
        String word = input.nextLine();

        String rev = "";

        for(int i = word.length() - 1 ; i >= 0; i--)
        {
            rev += word.charAt(i);
        }

        if(word.equals(rev))
        {
            System.out.print("The String is a Palindrome");
        }
        else{
            System.out.print("The String is not a Palindrome");
        }

        input.close();
    }
}
